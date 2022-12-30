package it.pagopa.pn.api.dto.notification.address;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.pagopa.pn.api.dto.events.*;
import it.pagopa.pn.api.dto.exception.SQSSendMessageException;
import it.pagopa.pn.model.LocalStackTestConfig;
import lombok.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.StringUtils;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.awscore.client.builder.AwsClientBuilder;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.GetQueueUrlRequest;
import software.amazon.awssdk.services.sqs.model.GetQueueUrlResponse;
import software.amazon.awssdk.services.sqs.model.ReceiveMessageRequest;
import software.amazon.awssdk.services.sqs.model.ReceiveMessageResponse;

import java.net.URI;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@Import(LocalStackTestConfig.class)
class AbstractSqsMomProducerTestIT {

    MomProducer<PnDeliveryNewNotificationEvent> producer;

    @Autowired
    SqsClient sqsClient;

    @BeforeEach
    public void init() {
        String topicName = "local-model-test-it";
        ObjectMapper objectMapper = new ObjectMapper();
        producer = new ProducerTest(sqsClient, topicName, objectMapper);
    }

    @Test
    void pushTest() {
        PnDeliveryNewNotificationEvent message = buildMessage();
        assertDoesNotThrow(() -> producer.push(message));

        GetQueueUrlResponse resqurl = sqsClient.getQueueUrl(GetQueueUrlRequest.builder()
                        .queueName("local-model-test-it")
                .build());

        System.out.println(resqurl.queueUrl());
        ReceiveMessageResponse res = sqsClient.receiveMessage(ReceiveMessageRequest.builder()
                .queueUrl(resqurl.queueUrl())
                .build());

        assertEquals("{\"paId\":\"pa-id-test\"}", res.messages().get(0).body());


    }


    @Test
    void pushTestGeneric() {
        TestEvent message = buildMessageGeneric();
        MomProducer<TestEvent> producer;
        String topicName = "local-model-test-it";
        ObjectMapper objectMapper = new ObjectMapper();
        producer = new ProducerGenericTest(sqsClient, topicName, objectMapper);

        assertDoesNotThrow(() -> producer.push(message));

        GetQueueUrlResponse resqurl = sqsClient.getQueueUrl(GetQueueUrlRequest.builder()
                .queueName("local-model-test-it")
                .build());

        System.out.println(resqurl.queueUrl());
        ReceiveMessageResponse res = sqsClient.receiveMessage(ReceiveMessageRequest.builder()
                .queueUrl(resqurl.queueUrl())
                .build());

        assertEquals("{\"paId\":\"pa-id-test\"}", res.messages().get(0).body());


    }

    @Test
    void pushTestNoIUN() {
        PnDeliveryNewNotificationEvent message = buildMessageNOIUN();
        assertThrows((SQSSendMessageException.class), () -> producer.push(message));

    }


    private PnDeliveryNewNotificationEvent buildMessage() {
        return PnDeliveryNewNotificationEvent.builder()
                .header(StandardEventHeader.builder()
                        .iun("test-iun")
                        .eventId("event-id-test")
                        .createdAt(Instant.now())
                        .eventType("event-type-test")
                        .publisher("test")
                        .build())
                .payload(PnDeliveryNewNotificationEvent.Payload.builder().paId("pa-id-test").build())
                .build();
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    private static class TestEvent
            implements GenericEvent<GenericEventHeader, TestEvent.Payload> {
        private Payload payload;

        private GenericEventHeader header;

        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Builder(toBuilder = true)
        @EqualsAndHashCode
        @ToString
        public static class Payload {

            //Codice IPA della PA mittente
            private String paId;
        }
    }


    private TestEvent buildMessageGeneric() {
        return TestEvent.builder()
                .header(GenericEventHeader.builder()
                        .eventId("event-id-test")
                        .createdAt(Instant.now())
                        .eventType("event-type-test")
                        .publisher("test")
                        .build())
                .payload(TestEvent.Payload.builder().paId("pa-id-test").build())
                .build();
    }

    private PnDeliveryNewNotificationEvent buildMessageNOIUN() {
        return PnDeliveryNewNotificationEvent.builder()
                .header(StandardEventHeader.builder()
                        .eventId("event-id-test")
                        .createdAt(Instant.now())
                        .eventType("event-type-test")
                        .build())
                .payload(PnDeliveryNewNotificationEvent.Payload.builder().paId("pa-id-test").build())
                .build();
    }



    private static class ProducerTest extends AbstractSqsMomProducer<PnDeliveryNewNotificationEvent> {

        protected ProducerTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, PnDeliveryNewNotificationEvent.class);
        }
    }



    private static class ProducerGenericTest extends AbstractSqsMomProducer<TestEvent> {

        protected ProducerGenericTest(SqsClient sqsClient, String topic, ObjectMapper objectMapper) {
            super(sqsClient, topic, objectMapper, TestEvent.class);
        }
    }


    @TestConfiguration
    static class TestConfig {

        @Bean
        public SqsClient sqsClient() {
            return configureBuilder( SqsClient.builder() );
        }


        private <C> C configureBuilder(AwsClientBuilder<?, C> builder) {
            String profileName = "default";
            if(StringUtils.hasText( profileName ) ) {
                builder.credentialsProvider( ProfileCredentialsProvider.create( profileName ));
            }
            String endpointUrl =System.getProperty("aws.endpoint-url");
            if(StringUtils.hasText( endpointUrl )) {
                builder.endpointOverride( URI.create( endpointUrl ));
            }

            return builder.build();
        }

    }

}
