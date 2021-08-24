package it.pagopa.pn.api.dto.notification;


import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.status.NotificationStatusHistoryElement;
import it.pagopa.pn.api.dto.notification.timeline.TimelineElement;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
@Schema(
        description = "Le notifiche di Piattaforma Notifiche",
        externalDocs = @ExternalDocumentation( description = "MarkDown", url = "http://google.it/"))
public class Notification {

    @Schema( description = "L'Identificativo Univoco Notifica assegnato da PN")
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String iun;

    @Schema( description = "Numero di protocollo che la PA mittente assegna alla notifica stessa" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @NotBlank( groups = { NotificationJsonViews.New.class })
    private String paNotificationId;

    @Schema( description = "titolo della notifica" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @NotBlank( groups = { NotificationJsonViews.New.class })
    private String subject;

    @Schema( description = "Momento di ricezione della notifica da parte di PN" )
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private Instant sentAt;


    @Schema( description = "IUN della notifica rettificata da questa notifica" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String cancelledIun;

    @Schema( description = "IUN della notifica che ha rettificato questa notifica" )
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String cancelledByIun;

    @Schema( description = "Informazioni sul mittente" )
    @JsonView(value = { NotificationJsonViews.Received.class })
    @NotNull(groups = { NotificationJsonViews.New.class })
    @Valid
    private NotificationSender sender ;

    @Schema( description = "Informazioni sui destinatari" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class })
    @NotEmpty(groups = { NotificationJsonViews.New.class })
    private List< @NotNull(groups = { NotificationJsonViews.New.class }) @Valid NotificationRecipient> recipients ;

    @Schema( description = "Documenti notificati e lettere di accompagnamento" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @NotEmpty(groups = { NotificationJsonViews.New.class })
    private List< @NotNull(groups = { NotificationJsonViews.New.class }) @Valid NotificationAttachment> documents ;

    @Schema( description = "Informazioni per effttuare il pagamento" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private NotificationPaymentInfo payment;

    @Schema( description = "stato di avanzamento del processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private NotificationStatus notificationStatus;

    @Schema( description = "elenco degli avanzamenti effettuati dal processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class })
    private List<NotificationStatusHistoryElement> notificationStatusHistory;

    @Schema( description = "elenco dettagliato di tutto ciò che è accaduto durrante il processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class })
    private List<TimelineElement> timeline;

}
