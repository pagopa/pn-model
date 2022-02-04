package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnDeliveryNewNotificationEvent implements GenericEvent<StandardEventHeader, PnDeliveryNewNotificationEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;


    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {

        @Schema(description = "Codice IPA della PA mittente")
        private String paId;
    }
}
