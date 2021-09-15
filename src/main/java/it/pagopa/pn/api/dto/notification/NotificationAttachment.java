package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.annotation.SHA256;
import it.pagopa.pn.api.dto.notification.annotation.ValidBody;
import it.pagopa.pn.api.dto.notification.annotation.ValidNotificationAttachment;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ValidNotificationAttachment(groups = NotificationJsonViews.New.class)
@ToString public class NotificationAttachment {

    @Schema( description = "codice di controllo del allegato" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @NotNull(groups = { NotificationJsonViews.New.class })
    @Valid
    private Digests digests;

    @Schema( description = "tipo di contenuto dell'allegato" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @NotBlank(groups = { NotificationJsonViews.New.class })
    private String contentType;

    @Schema( description = "corpo dell'allegato" )
    @JsonView(value = { NotificationJsonViews.New.class })
    @NotBlank(groups = { NotificationJsonViews.New.class })
    //@Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$", message = "The string is not in Base64", groups = { NotificationJsonViews.New.class } )
    @ValidBody(groups = { NotificationJsonViews.New.class })
    private String body;

    @JsonIgnore
    private String savedVersionId;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Digests {

        @Schema( description = "Digest \"sha256\" della codifica binaria dell'allegato" )
        @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        @NotBlank(groups = { NotificationJsonViews.New.class })
        @SHA256(groups = { NotificationJsonViews.New.class })
        private String sha256;
    }
}
