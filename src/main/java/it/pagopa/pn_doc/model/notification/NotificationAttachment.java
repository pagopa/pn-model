package it.pagopa.pn_doc.model.notification;

import it.pagopa.pn.model.notification.INotificationAttachment;
import it.pagopa.pn.model.notification.INotificationAttachmentDigests;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NotificationAttachment implements INotificationAttachment {

    private Digests digests;
    private String contentType;

    private String body;

    @Value
    public class Digests implements INotificationAttachmentDigests {
        private String sha256;
    }
}
