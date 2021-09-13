package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationAttachment {

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
    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$", message = "The string is not in Base64", groups = { NotificationJsonViews.New.class } )
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
        @Pattern(regexp = "^[A-Fa-f0-9]{64}$", message = "The string is not in Sha256", groups = { NotificationJsonViews.New.class } )
        private String sha256;
    }
}
