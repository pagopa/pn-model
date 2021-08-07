package it.pagopa.pn_doc.model.notification;

import it.pagopa.pn.model.notification.INotificationPaymentInfo;
import it.pagopa.pn.model.notification.INotificationPaymentInfoF24;
import it.pagopa.pn.model.notification.NotificationPaymentInfoFeePolicies;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NotificationPaymentInfo implements INotificationPaymentInfo {

    private String iuv;
    private NotificationPaymentInfoFeePolicies notificationFeePolicy;
    private F24 f24 ;

    @Value
    @Builder
    public static class F24 implements INotificationPaymentInfoF24 {
        private NotificationAttachment flatRate;
        private NotificationAttachment digital;
        private NotificationAttachment analog;
    }
}
