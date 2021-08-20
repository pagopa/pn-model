package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnDeliveryNewNotificationEvent implements GenericEvent<StandardEventHeader, PnDeliveryNewNotificationEvent.Payload> {

    @JsonProperty( PN_EVENT_HEADER )
    private StandardEventHeader header;

    @JsonProperty( PN_EVENT_PAYLOAD )
    private Payload payload;


    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {

        public static final String PN_NEW_NOTIFICATION_EVENT_PAID = "paId";

        @Schema( name = PN_NEW_NOTIFICATION_EVENT_PAID, description = "Codice IPA della PA mittente")
        @JsonProperty( PN_NEW_NOTIFICATION_EVENT_PAID )
        private String paId;
    }
}
