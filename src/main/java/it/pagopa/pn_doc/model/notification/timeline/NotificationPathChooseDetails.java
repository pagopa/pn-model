package it.pagopa.pn_doc.model.notification.timeline;

import it.pagopa.pn.model.notification.timeline.DeliveryMode;
import it.pagopa.pn.model.notification.timeline.INotificationPathChooseDetails;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationPathChooseDetails implements INotificationPathChooseDetails {

    String fc;
    DeliveryMode deliveryMode;

}
