package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
public class NewNotificationEvent implements GenericEvent<StandardEventHeader, NewNotificationEvent.Payload> {

    private StandardEventHeader header;
    private Payload payload;


    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    public static class Payload {

        @Schema( name = "paId", description = "Codice IPA della PA mittente")
        private String paId;
    }
}
