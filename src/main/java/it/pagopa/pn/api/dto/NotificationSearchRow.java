package it.pagopa.pn.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationSearchRow {
    @Schema(name = "iun", description = "Identificativo Univoco Notifica")
    private String iun;

    @Schema(name = "paNotificationId", description = "Numero protocollo associato alla notifica da parte della PA")
    private String paNotificationId;

    @Schema(name = "senderId", description = "Identificativo IPA della PA mittente")
    private String senderId;

    @Schema(name = "sentAt", description = "Data spedizione notifica")
    private Instant sentAt;

    @Schema(name = "subject", description = "Oggetto della notifica")
    private String subject;

    @Schema(name = "notificationStatus", description = "Stato del workflow della notifica")
    private NotificationStatus notificationStatus;

    @Schema(name = "recipientId", description = "Identificativo opaco del destinatario")
    private String recipientId;

}
