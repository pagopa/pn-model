package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PublicRegistryCallDetails implements TimelineElementDetails {//NEW
    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Codice Fiscale destinatario notifica digitale")
    @NotNull
    private String taxId;

    @Schema(description = "Tipologia Domiciliazione")
    private DeliveryMode deliveryMode;

    @Schema(description = "Fase in cui è avvenuta la richiesta")
    @NotNull
    private ContactPhase contactPhase;

    @NotNull
    @Schema(description = "Numero di tentativi di notificazione già effettuati")
    @NotNull
    private int sentAttemptMade;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Data invio richiesta ai public registry")
    private Instant sendDate;
}
