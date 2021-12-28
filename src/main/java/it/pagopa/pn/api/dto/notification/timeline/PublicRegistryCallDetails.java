package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PublicRegistryCallDetails implements TimelineElementDetails {
    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

    @JsonIgnore
    @Schema(description = "Tipologia Domiciliazione")
    private DeliveryMode deliveryMode;

    @JsonIgnore
    @Schema(description = "Fase in cui è avvenuta la richiesta")
    private ContactPhase contactPhase;

    @JsonIgnore
    @Schema(description = "Numero di tentativi di notificazione già effettuati")
    private int sentAttemptMade;
}
