package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationAttachment;
import it.pagopa.pn.api.dto.notification.NotificationRecipient;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ReceivedDetails {

    @Schema( name = "recipients", description = "informazioni sui destinatari")
    private List<NotificationRecipient> recipients;

    @Schema( name = "documentsDigests", description = "Codici di controllo dei documenti inviati")
    private List<NotificationAttachment.Digests> documentsDigests;

    @Schema( name = "f24Digests", description = "Codici di controllo dei moduli di pagamento F24 inviati dalla PA")
    private F24Digests f24Digests;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class F24Digests {

        @Schema( name = "flatRate", description = "codice di controllo del F24 per spese di notifica forfettarie")
        private NotificationAttachment.Digests flatRate;

        @Schema( name = "digital", description = "codice di controllo del F24 per spese di notifica digitale")
        private NotificationAttachment.Digests digital;

        @Schema( name = "analog", description = "codice di controllo del F24 per spese di notifica analogica")
        private NotificationAttachment.Digests analog;
    }

}
