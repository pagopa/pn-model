package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import java.util.List;

@Slf4j
public abstract class AbstractSqsFifoMomProducer<T extends GenericFifoEvent> extends AbstractSqsMomProducer<T>  {

    protected AbstractSqsFifoMomProducer(SqsClient sqsClient, String topic, ObjectMapper objectMapper, Class<T> msgClass) {
        super(sqsClient, topic, objectMapper, msgClass);
    }

    protected AbstractSqsFifoMomProducer(SqsClient sqsClient, String topic, ObjectMapper objectMapper, Class<T> msgClass, int retriesForBatch) {
        super(sqsClient, topic, objectMapper, msgClass, retriesForBatch);
    }

    @Override
    public void push(List<T> msges) {
        log.debug("Inserting data {} in SQS {} with sendMessageBatch", msges, topic);

        List<SendMessageBatchRequestEntry> entries = msges.stream()
                .map(msg -> SendMessageBatchRequestEntry.builder()
                        .messageBody(toJson(msg.getPayload()))
                        .id(msg.getHeader().getEventId())
                        .messageAttributes(getSqSHeader(msg.getHeader()))
                        .messageGroupId(msg.getMessageGroupId())
                        .messageDeduplicationId(msg.getMessageDeduplicationId())
                        .build()
                )
                .toList();

        pushInBatch(entries, 1);
        log.info("Inserted data in SQS {}", this.topic);
    }

    @Override
    public void push(List<T> msges, Integer delaySeconds) {
        log.warn("FIFO queues don't support timers on individual messages, delaySeconds ignored");
        push(msges);
    }

    @Override
    public void push(T message) {
        log.debug("Inserting data {} in SQS {} with sendMessage", message, topic);
        SendMessageRequest request = SendMessageRequest.builder()
                .queueUrl(getQueueUrl())
                .messageBody(toJson(message.getPayload()))
                .messageAttributes(getSqSHeader(message.getHeader()))
                .messageGroupId(message.getMessageGroupId())
                .messageDeduplicationId(message.getMessageDeduplicationId())
                .build();

        sqsClient.sendMessage(request);
        log.info("Inserted data in SQS {}", this.topic);
    }

    @Override
    public void push(T message, Integer delaySeconds) {
        log.warn("FIFO queues don't support timers on individual messages, delaySeconds ignored");
        push(message);
    }
}
