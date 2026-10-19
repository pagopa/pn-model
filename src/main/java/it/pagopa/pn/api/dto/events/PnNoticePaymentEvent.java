package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PnNoticePaymentEvent implements GenericEvent<StandardEventHeader, PnNoticePaymentEvent.Payload>, GenericEventBridgeEvent<PnNoticePaymentEvent.Detail> {

    private StandardEventHeader header;

    private PnNoticePaymentEvent.Payload payload;

    private PnNoticePaymentEvent.Detail detail;

    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Payload {

        private String modelType;

        private String iuv;

        private String iur;

        private String noticeCode;

        private String creditorTaxId;

        private String creditorCompanyName;

        private Instant paymentDateTime;

        private Instant dueDate;

        private Integer totalNotice;

        private String paymentSourceChannel;

        private Integer amount;

        private String paymentMethod;

        private String fee;

        private String paymentId;

        private Instant pagopaPersistedTimestamp;

        private Instant pagopaPublishedTimestamp;

        private Instant sendIngestionTimestamp;

        private String kafkaPartition;

        private String communicationType;

        private String iun;

        private Integer recIndex;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Detail {
        String clientId;
        Payload PnNoticePaymentEventPayload;
    }
}
