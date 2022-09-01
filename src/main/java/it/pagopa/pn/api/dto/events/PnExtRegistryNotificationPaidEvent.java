package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnExtRegistryNotificationPaidEvent implements GenericEvent<StandardEventHeader, PnExtRegistryNotificationPaidEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {
        @Schema( description = "Payment PA fiscal code")
        private String paTaxId;

        @Schema( description = "Payment notice number")
        private String noticeCode;

        @Schema( description = "Payment date")
        private Instant eventDate;
    }
}
