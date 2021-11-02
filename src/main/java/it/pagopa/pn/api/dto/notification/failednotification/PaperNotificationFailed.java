package it.pagopa.pn.api.dto.notification.failednotification;

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
public class PaperNotificationFailed {
    @Schema(description = "L'Identificativo univico del ricevente")
    @JsonView(value = {NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String recipientId;

    @Schema(description = "L'Identificativo Univoco Notifica assegnato da PN")
    @JsonView(value = {NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String iun;

}
