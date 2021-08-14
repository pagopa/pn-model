package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class NotificationAttachment {

    @Schema( name = "digests", description = "codice di controllo del allegato" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private Digests digests;

    @Schema( name = "contentType", description = "tipo di contenuto dell'allegato" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String contentType;

    @Schema( name = "body", description = "corpo dell'allegato" )
    @JsonView(value = { NotificationJsonViews.New.class })
    private String body;

    @JsonIgnore
    private String savedVersionId;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder( toBuilder = true )
    public static class Digests {

        @Schema( name = "sha256", description = "Digest \"sha256\" della codifica binaria dell'allegato" )
        @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        private String sha256;
    }
}
