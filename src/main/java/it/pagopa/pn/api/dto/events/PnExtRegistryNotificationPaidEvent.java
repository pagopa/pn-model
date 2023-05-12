package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnExtRegistryNotificationPaidEvent implements GenericFifoEvent<StandardEventHeader, PnExtRegistryNotificationPaidEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;

    private String messageDeduplicationId;

    private String messageGroupId;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {
        //@Schema( description = "Payment PA fiscal code")
        private String paTaxId;

        //@Schema( description = "Payment notice number")
        private String noticeCode;

        //@Schema( description = "Payment date")
        private Instant eventDate;
    }
}
