package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PnNoticePaymentEvent implements GenericEvent<StandardEventHeader, PnNoticePaymentEvent.Payload>, GenericEventBridgeEvent<PnNoticePaymentEvent.Payload> {

    private StandardEventHeader header;

    private PnNoticePaymentEvent.Payload payload;

    @Override
    public Payload getDetail() {
        return payload;
    }

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
    }

}
