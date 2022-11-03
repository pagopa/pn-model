package it.pagopa.pn.api.dto.notification.address;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.pagopa.pn.api.dto.events.*;
import it.pagopa.pn.api.dto.exception.PayloadClassLoadingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AbstractSqsMomProducerTest {

    MomProducer<PnDeliveryNewNotificationEvent> producer;

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
        PnDeliveryNewNotificationEvent message = buildMessage();
        assertDoesNotThrow(() -> producer.push(message));
    }

    @Test
    void failedInitializationTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        assertThrows(
                PayloadClassLoadingException.class,
                () -> new ProducerFailedTest(sqsClient, "aTopic", objectMapper)
        );
    }

    private PnDeliveryNewNotificationEvent buildMessage() {
        return PnDeliveryNewNotificationEvent.builder()
                .header(StandardEventHeader.builder()
                        .iun("test-iun")
                        .eventId("event-id-test")
                        .createdAt(Instant.now())
                        .eventType("event-type-test")
                        .build())
                .payload(PnDeliveryNewNotificationEvent.Payload.builder().paId("pa-id-test").build())
                .build();
    }


    private class ProducerTest extends AbstractSqsMomProducer<PnDeliveryNewNotificationEvent> {

        protected ProducerTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, PnDeliveryNewNotificationEvent.class);
        }
    }

    private class ProducerFailedTest extends AbstractSqsMomProducer<EventWithoutPayload> {

        protected ProducerFailedTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, EventWithoutPayload.class);
        }
    }

    private class EventWithoutPayload implements GenericEvent<StandardEventHeader, PnDeliveryNewNotificationEvent.Payload> {

        @Override
        public StandardEventHeader getHeader() {
            return null;
        }

        @Override
        public PnDeliveryNewNotificationEvent.Payload getPayload() {
            return null;
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
            return null;
        }
    }
}
