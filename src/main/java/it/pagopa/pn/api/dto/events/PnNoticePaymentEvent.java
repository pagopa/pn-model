package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PnNoticePaymentEvent implements GenericEvent<GenericEventHeader, PnNoticePaymentEvent.Payload>, GenericEventBridgeEvent<PnNoticePaymentEvent.Payload> {

    private GenericEventHeader header;

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

        @ToString.Exclude
        private String modelType;

        @ToString.Exclude
        private String iuv;

        @ToString.Exclude
        private String iur;

        private String noticeCode;

        private String creditorTaxId;

        @ToString.Exclude
        private String creditorCompanyName;

        @ToString.Exclude
        private Instant paymentDateTime;

        @ToString.Exclude
        private LocalDate dueDate;

        @ToString.Exclude
        private Integer totalNotice;

        @ToString.Exclude
        private String paymentSourceChannel;

        @ToString.Exclude
        private Integer amount;

        @ToString.Exclude
        private String paymentMethod;

        @ToString.Exclude
        private String fee;

        private String paymentId;

        @ToString.Exclude
        private Instant pagopaPersistedTimestamp;

        @ToString.Exclude
        private Instant pagopaPublishedTimestamp;

        @ToString.Exclude
        private Instant sendIngestionTimestamp;

        @ToString.Exclude
        private String kafkaPartition;
    }

}
