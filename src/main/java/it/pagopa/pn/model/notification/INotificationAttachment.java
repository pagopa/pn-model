package it.pagopa.pn.model.notification;


public interface INotificationAttachment {

    INotificationAttachmentDigests getDigests();
    String getContentType();

    String getBody();

}
