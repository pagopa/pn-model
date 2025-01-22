package it.pagopa.pn.api.dto.notification.address;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.pagopa.pn.api.dto.events.*;
import it.pagopa.pn.api.dto.exception.SQSSendMessageException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AbstractSqsFifoMomProducerTest {

    MomProducer<PnDeliveryNotificationViewedEvent> producer;

    SqsClient sqsClient;

    @BeforeEach
    public void init() {
        sqsClient = new SqsClientTest();
        String topicName = "topic-test";
        ObjectMapper objectMapper = new ObjectMapper();
        producer = new ProducerTest(sqsClient, topicName, objectMapper);
    }

    @Test
    void pushTest() {
        PnDeliveryNotificationViewedEvent message = buildMessage();
        assertDoesNotThrow(() -> producer.push(message));
    }

    @Test
    void pushTestWithDelaySecondsNull() {
        PnDeliveryNotificationViewedEvent message = buildMessage();
        assertDoesNotThrow(() -> producer.push(message, null));
    }

    @Test
    void pushTestWithDelaySecondsNotNull() {
        PnDeliveryNotificationViewedEvent message = buildMessage();
        assertDoesNotThrow(() -> producer.push(message, 1));
    }


    @Test
    void pushTestFail() {
        PnDeliveryNotificationViewedEvent message = buildMessage();
        SqsClientTestFail sqsClientFail = new SqsClientTestFail();
        String topicName = "topic-test";
        ObjectMapper objectMapper = new ObjectMapper();
        ProducerTest producer = new ProducerTest(sqsClientFail, topicName, objectMapper);
        assertThrows((SQSSendMessageException.class),() -> producer.push(message));
    }

    private PnDeliveryNotificationViewedEvent buildMessage() {
        return PnDeliveryNotificationViewedEvent.builder()
                .messageGroupId("event-id-test")
                .messageDeduplicationId("event-id-test")
                .header(StandardEventHeader.builder()
                        .iun("test-iun")
                        .eventId("event-id-test")
                        .createdAt(Instant.now())
                        .eventType("event-type-test")
                        .build())
                .payload(PnDeliveryNotificationViewedEvent.Payload.builder().iun("test-iun").recipientIndex(0).build())
                .build();
    }


    private class ProducerTest extends AbstractSqsFifoMomProducer<PnDeliveryNotificationViewedEvent> {

        protected ProducerTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, PnDeliveryNotificationViewedEvent.class);
        }
    }

    private class SqsClientTest implements SqsClient {

        @Override
        public String serviceName() {
            return "test";
        }

        @Override
        public void close() {

        }

        @Override
        public GetQueueUrlResponse getQueueUrl(GetQueueUrlRequest getQueueUrlRequest) throws QueueDoesNotExistException, AwsServiceException, SdkClientException, SqsException {
            return GetQueueUrlResponse.builder().queueUrl("test-url").build();
        }

        @Override
        public SendMessageBatchResponse sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) throws TooManyEntriesInBatchRequestException, EmptyBatchRequestException, BatchEntryIdsNotDistinctException, BatchRequestTooLongException, InvalidBatchEntryIdException, software.amazon.awssdk.services.sqs.model.UnsupportedOperationException, AwsServiceException, SdkClientException, SqsException {
            return SendMessageBatchResponse.builder().build();
        }
    }



    static class SqsClientTestFail implements SqsClient {

        @Override
        public String serviceName() {
            return "test";
        }

        @Override
        public void close() {

        }

        @Override
        public GetQueueUrlResponse getQueueUrl(GetQueueUrlRequest getQueueUrlRequest) throws  AwsServiceException, SdkClientException {
            return GetQueueUrlResponse.builder().queueUrl("test-url").build();
        }

        @Override
        public SendMessageBatchResponse sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) throws      AwsServiceException, SdkClientException {
            return SendMessageBatchResponse.builder()
                    .failed(BatchResultErrorEntry.builder()
                            .code("code1")
                            .message("errore codice 1")
                            .build())
                    .build();
        }
    }
}
