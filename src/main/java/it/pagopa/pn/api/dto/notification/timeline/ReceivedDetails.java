package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationAttachment;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.NotificationRecipient;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ReceivedDetails implements TimelineElementDetails {

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "informazioni sui destinatari")
    private List<NotificationRecipient> recipients;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codici di controllo dei documenti inviati")
    private List<NotificationAttachment.Digests> documentsDigests;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codici di controllo dei moduli di pagamento F24 inviati dalla PA")
    private F24Digests f24Digests;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class F24Digests {

        @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        @Schema(  description = "codice di controllo del F24 per spese di notifica forfettarie")
        private NotificationAttachment.Digests flatRate;

        @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        @Schema( description = "codice di controllo del F24 per spese di notifica digitale")
        private NotificationAttachment.Digests digital;

        @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        @Schema( description = "codice di controllo del F24 per spese di notifica analogica")
        private NotificationAttachment.Digests analog;
    }

}
