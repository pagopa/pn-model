package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.pagopa.pn.api.dto.exception.SQSSendMessageException;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.BatchResultErrorEntry;
import software.amazon.awssdk.services.sqs.model.SendMessageBatchRequest;
import software.amazon.awssdk.services.sqs.model.SendMessageBatchRequestEntry;
import software.amazon.awssdk.services.sqs.model.SendMessageBatchResponse;

import java.util.List;

@Slf4j
public abstract class AbstractSqsFifoMomProducer<T extends GenericFifoEvent> extends AbstractSqsMomProducer<T>  {

    protected AbstractSqsFifoMomProducer(SqsClient sqsClient, String topic, ObjectMapper objectMapper, Class<T> msgClass) {
        super(sqsClient, topic, objectMapper, msgClass);
    }

    @Override
    public void push(List<T> msges) {
        log.debug("Inserting data {} in SQS {}", msges, topic);
        SendMessageBatchResponse response = sqsClient.sendMessageBatch(SendMessageBatchRequest.builder()
                .queueUrl(this.queueUrl)
                .entries(msges.stream()
                        .map(msg -> SendMessageBatchRequestEntry.builder()
                            .messageBody(toJson(msg.getPayload()))
                            .id(msg.getHeader().getEventId())
                            .messageAttributes(getSqSHeader(msg.getHeader()))
                            .messageGroupId(msg.getMessageGroupId())
                            .messageDeduplicationId(msg.getMessageDeduplicationId())
                            .build()
                        )
                        .toList())
                .build());

        // venivano ignorati silentemente eventuali errori di invio
        if (response.hasFailed())
        {
            StringBuilder builder = new StringBuilder();
            for (BatchResultErrorEntry fail :response.failed()) {
                builder.append(fail.code());
                builder.append("-");
                builder.append(fail.message());
                builder.append(";");
            }
            throw new SQSSendMessageException(builder.toString());
        }
        log.info("Inserted data in SQS {}", this.topic);
    }

    @Override
    public void push(List<T> msges, Integer delaySeconds) {
        log.warn("FIFO queues don't support timers on individual messages, delaySeconds ignored");
        push(msges);
    }
}
