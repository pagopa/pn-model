package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

public class NewNotificationEvent extends GenericEvent<StandardEventHeader, NewNotificationEvent.Payload> {

    public NewNotificationEvent( GenericEvent<StandardEventHeader, NewNotificationEvent.Payload> s ) {
        this( s.getHeader(), s.getPayload() );
    }

    NewNotificationEvent(StandardEventHeader header, Payload payload) {
        super(header, payload);
    }

    @Value
    @Builder( toBuilder = true )
    public static class Payload {

        @Schema( name = "paId", description = "Codice IPA della PA mittente")
        private String paId;
    }
}
