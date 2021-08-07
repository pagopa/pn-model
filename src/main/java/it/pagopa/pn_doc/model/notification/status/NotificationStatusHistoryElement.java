package it.pagopa.pn_doc.model.notification.status;

import it.pagopa.pn.model.notification.status.INotificationStatusHistoryElement;
import it.pagopa.pn.model.notification.status.NotificationStatus;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class NotificationStatusHistoryElement implements INotificationStatusHistoryElement {

    private NotificationStatus status;
    private Instant activeFrom;
}
