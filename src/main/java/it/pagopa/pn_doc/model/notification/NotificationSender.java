package it.pagopa.pn_doc.model.notification;

import it.pagopa.pn.model.notification.INotificationSender;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NotificationSender implements INotificationSender {

    private String paId;
    private String paName;

}
