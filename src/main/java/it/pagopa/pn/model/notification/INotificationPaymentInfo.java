package it.pagopa.pn.model.notification;

public interface INotificationPaymentInfo {

    String getIuv();
    NotificationPaymentInfoFeePolicies getNotificationFeePolicy();
    INotificationPaymentInfoF24 getF24();

}
