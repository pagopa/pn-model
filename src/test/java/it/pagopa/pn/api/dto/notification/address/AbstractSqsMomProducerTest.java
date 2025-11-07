package it.pagopa.pn.api.dto.notification.address;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.pagopa.pn.api.dto.events.*;
import it.pagopa.pn.api.dto.exception.PayloadClassLoadingException;
import it.pagopa.pn.api.dto.exception.SQSSendMessageException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AbstractSqsMomProducerTest {

    MomProducer<PnDeliveryNewNotificationEvent> producer;

    SqsClient sqsClient;

    final ObjectMapper objectMapper = new ObjectMapper();

    final String topicName = "topic-test";

    @BeforeEach
    void init() {
        sqsClient = new SqsClientTest();
        producer = new ProducerTest(sqsClient, topicName, objectMapper);
    }

    @Test
    void pushTest() {
        PnDeliveryNewNotificationEvent message = buildMessage();
        assertDoesNotThrow(() -> producer.push(message));
    }

    @Test
    void pushBatchTest() {
        PnDeliveryNewNotificationEvent message = buildMessage();
        PnDeliveryNewNotificationEvent messageTwo = buildMessage();
        assertDoesNotThrow(() -> producer.push(List.of(message, messageTwo)));
    }

    @Test
    void pushBatchWithRetriesTest() {
        MomProducer<PnDeliveryNewNotificationEvent> producerRetrievable = new ProducerTest(sqsClient, topicName, objectMapper, 1);
        PnDeliveryNewNotificationEvent message = buildMessage();
        PnDeliveryNewNotificationEvent messageTwo = buildMessage();
        assertDoesNotThrow(() -> producerRetrievable.push(List.of(message, messageTwo)));
    }


    @Test
    void pushTestFail() {
        PnDeliveryNewNotificationEvent message = buildMessage();
        SqsClientTestFail sqsClientFail = new SqsClientTestFail();
        ProducerTest producerFailed = new ProducerTest(sqsClientFail, topicName, objectMapper);
        assertThrows((SdkClientException.class),() -> producerFailed.push(message));
    }

    @Test
    void pushBatchTestFail() {
        PnDeliveryNewNotificationEvent message = buildMessage();
        SqsClientTestFail sqsClientFail = new SqsClientTestFail();
        ProducerTest producerFailed = new ProducerTest(sqsClientFail, topicName, objectMapper);
        assertThrows((SQSSendMessageException.class),() -> producerFailed.push(List.of(message)));
    }

    @Test
    void pushBatchWithRetriesTestFail() {
        PnDeliveryNewNotificationEvent message = buildMessage();
        SqsClientTestFail sqsClientFail = new SqsClientTestFail();
        ProducerTest producerRetriable = new ProducerTest(sqsClientFail, topicName, objectMapper, 1);
        assertThrows((SQSSendMessageException.class),() -> producerRetriable.push(List.of(message)));
    }

    @Test
    void failedInitializationTest() {
        assertThrows(
                PayloadClassLoadingException.class,
                () -> new ProducerFailedTest(sqsClient, "aTopic", objectMapper)
        );
    }

    private PnDeliveryNewNotificationEvent buildMessage() {
        Instant now = Instant.now();
        return PnDeliveryNewNotificationEvent.builder()
                .header(StandardEventHeader.builder()
                        .iun("test-iun-".concat(String.valueOf(now.toEpochMilli())))
                        .eventId("event-id-test".concat(String.valueOf(now.toEpochMilli())))
                        .createdAt(now)
                        .eventType("event-type-test")
                        .build())
                .payload(PnDeliveryNewNotificationEvent.Payload.builder().paId("pa-id-test").build())
                .build();
    }


    static class ProducerTest extends AbstractSqsMomProducer<PnDeliveryNewNotificationEvent> {

        protected ProducerTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, PnDeliveryNewNotificationEvent.class);
        }

        protected ProducerTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper, int retriesForBatch) {
            super(sqsClient, topic, objectMapper, PnDeliveryNewNotificationEvent.class, retriesForBatch);
        }
    }

    private static class ProducerFailedTest extends AbstractSqsMomProducer<EventWithoutPayload> {

        protected ProducerFailedTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, EventWithoutPayload.class);
        }

        protected ProducerFailedTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper, int retriesForBatch) {
            super(sqsClient, topic, objectMapper, EventWithoutPayload.class, retriesForBatch);
        }
    }

    private static class EventWithoutPayload implements GenericEvent<StandardEventHeader, PnDeliveryNewNotificationEvent.Payload> {

        @Override
        public StandardEventHeader getHeader() {
            return null;
        }

        @Override
        public PnDeliveryNewNotificationEvent.Payload getPayload() {
            return null;
        }
    }

    private static class SqsClientTest implements SqsClient {

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
            return SendMessageBatchResponse.builder().build();
        }

        @Override
        public  SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) throws InvalidMessageContentsException, software.amazon.awssdk.services.sqs.model.UnsupportedOperationException, AwsServiceException, SdkClientException, SqsException {
            return SendMessageResponse.builder().build();
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

        @Override
        public  SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) throws InvalidMessageContentsException, software.amazon.awssdk.services.sqs.model.UnsupportedOperationException, AwsServiceException, SdkClientException, SqsException {
            throw SdkClientException.create("error");
        }
    }
}
