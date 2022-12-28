package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageBatchRequest;
import software.amazon.awssdk.services.sqs.model.SendMessageBatchRequestEntry;

import java.util.List;

public abstract class AbstractSqsFifoMomProducer<T extends GenericFifoEvent> extends AbstractSqsMomProducer<T>  {

    protected AbstractSqsFifoMomProducer(SqsClient sqsClient, String topic, ObjectMapper objectMapper, Class<T> msgClass) {
        super(sqsClient, topic, objectMapper, msgClass);
    }

    @Override
    public void push(List<T> msges) {
        
        sqsClient.sendMessageBatch(SendMessageBatchRequest.builder()
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

    }
}
