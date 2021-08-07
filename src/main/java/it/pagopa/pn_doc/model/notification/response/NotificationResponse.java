package it.pagopa.pn_doc.model.notification.response;

import it.pagopa.pn.model.notification.INotificationResponse;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NotificationResponse implements INotificationResponse {

    private String iun;
    private String paNotificationId;

}
