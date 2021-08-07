package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class NotificationAttachment {

    @Schema( name = "digests", description = "codice di controllo del allegato" )
    private Digests digests;

    @Schema( name = "contentType", description = "tipo di contenuto dell'allegato" )
    private String contentType;

    @Schema( name = "body", description = "corpo dell'allegato" )
    @JsonView(value = { NotificationJsonViews.New.class })
    private String body;

    @Value
    @Builder( toBuilder = true )
    public static class Digests {

        @Schema( name = "sha256", description = "Digest \"sha256\" della codifica binaria dell'allegato" )
        private String sha256;
    }
}
