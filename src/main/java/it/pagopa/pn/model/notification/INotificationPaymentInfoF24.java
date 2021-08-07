package it.pagopa.pn.model.notification;

public interface INotificationPaymentInfoF24 {
    INotificationAttachment getFlatRate();

    INotificationAttachment getDigital();

    INotificationAttachment getAnalog();
}
