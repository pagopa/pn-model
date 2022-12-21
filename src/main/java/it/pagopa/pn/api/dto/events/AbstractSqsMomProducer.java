package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import it.pagopa.pn.api.dto.exception.PayloadClassLoadingException;
import it.pagopa.pn.api.dto.exception.SQSSendMessageException;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static it.pagopa.pn.api.dto.events.StandardEventHeader.*;

public abstract class AbstractSqsMomProducer<T extends GenericEvent> implements MomProducer<T> {

    protected final SqsClient sqsClient;
    private final ObjectWriter objectWriter;
    protected final String queueUrl;


    protected AbstractSqsMomProducer(SqsClient sqsClient, String topic, ObjectMapper objectMapper, Class<T> msgClass) {
        this.sqsClient = sqsClient;
        Class<?> payloadClass = getPayloadClass(msgClass);
        this.objectWriter = objectMapper.writerFor(payloadClass);

        this.queueUrl = getQueueUrl(sqsClient, topic);
    }

    @NotNull
    private Class<?> getPayloadClass(Class<T> msgClass) {
        try {
            return msgClass.getDeclaredField("payload").getType();
        } catch (NoSuchFieldException exc) {
            throw new PayloadClassLoadingException( "Preparing sqs producer " + this.getClass(), exc );
        }
    }

    private String getQueueUrl(SqsClient sqsClient, String topic) {
        return sqsClient.getQueueUrl(GetQueueUrlRequest.builder().queueName(topic).build()).queueUrl();
    }

    @Override
    public void push(List<T> msges) {
        
        SendMessageBatchResponse response = sqsClient.sendMessageBatch(SendMessageBatchRequest.builder()
                .queueUrl(this.queueUrl)
                .entries(msges.stream()
                        .map(msg -> SendMessageBatchRequestEntry.builder()
                            .messageBody(toJson(msg.getPayload()))
                            .id(msg.getHeader().getEventId())
                            .messageAttributes(getSqSHeader(msg.getHeader()))
                            .build()
                        )
                        .collect(Collectors.toList()))
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
    }

    protected String toJson(Object obj) {
        try {
            return objectWriter.writeValueAsString(obj);
        } catch (JsonProcessingException exc) {
            throw new IllegalStateException(exc);
        }
    }

    protected Map<String, MessageAttributeValue> getSqSHeader(GenericEventHeader header) {
               
        Map<String, MessageAttributeValue> map = new HashMap<>();

        map.put(PN_EVENT_HEADER_EVENT_ID, newStringAttributeValue(header.getEventId()));
        map.put(PN_EVENT_HEADER_EVENT_TYPE, newStringAttributeValue(header.getEventType()));
        map.put(PN_EVENT_HEADER_CREATED_AT, newStringAttributeValue(header.getCreatedAt().toString()));
        map.put(PN_EVENT_HEADER_PUBLISHER, newStringAttributeValue(header.getPublisher()));
        if (header instanceof StandardEventHeader)
        {
            map.put(PN_EVENT_HEADER_IUN, newStringAttributeValue(((StandardEventHeader)header).getIun()));
        }


        return map;
    }

    private MessageAttributeValue newStringAttributeValue(String value) {
        return MessageAttributeValue.builder()
                .dataType("String")
                .stringValue(value)
                .build();
    }
}
