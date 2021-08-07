package it.pagopa.pn_doc.model.notification;


import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn_doc.model.notification.status.NotificationStatusHistoryElement;
import it.pagopa.pn_doc.model.notification.timeline.TimelineElement;
import it.pagopa.pn.model.notification.INotification;
import it.pagopa.pn.model.notification.status.NotificationStatus;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder(toBuilder = true)
@Schema(
        name="Notification",
        title = "Notification",
        description = "Le notifiche di Piattaforma Notifiche",
        externalDocs = @ExternalDocumentation( description = "MarkDown", url = "http://google.it/"))
public class Notification implements INotification<NotificationRecipient, NotificationAttachment, NotificationStatusHistoryElement, TimelineElement> {

    @Schema(name = "iun", description = "L'Identificativo Univoco Notifica assegnato da PN")
    @JsonView(value = { NotificationJsonViews.Sent.class })
    private String iun;

    @Schema(name = "paNotificationId", description = "Numero di protocollo che la PA mittente assegna alla notifica stessa")
    //@JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String paNotificationId;

    @Schema(name = "subject", description = "titolo della notifica")
    //@JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String subject;

    @Schema(name = "cancelledIun", description = "IUN della notifica rettificata da questa notifica")
    //@JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String cancelledIun;

    @Schema(name = "cancelledByIun", description = "IUN della notifica che ha rettificato questa notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String cancelledByIun;

    @Schema(name = "sender", description = "Informazioni sul mittente")
    @JsonView(value = { NotificationJsonViews.Received.class })
    private NotificationSender sender ;

    @Schema(name = "recipients", description = "Informazioni sui destinatari")
    //@JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private List<NotificationRecipient> recipients ;

    @Schema(name = "documents", description = "Documenti notificati e lettere di accompagnamento")
    //@JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private List<NotificationAttachment> documents ;

    @Schema(name = "payment", description = "Informazioni per effttuare il pagamento")
    //@JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private NotificationPaymentInfo payment;

    @Schema(name = "notificationStatus", description = "stato di avanzamento del processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private NotificationStatus notificationStatus;

    @Schema(name = "notificationStatusHistory", description = "elenco degli avanzamenti effettuati dal processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class })
    private List<NotificationStatusHistoryElement> notificationStatusHistory;

    @Schema(name = "timeline", description = "elenco dettagliato di tutto ciò che è accaduto durrante il processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class })
    private List<TimelineElement> timeline;

}
