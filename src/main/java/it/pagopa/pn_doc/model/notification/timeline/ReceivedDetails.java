package it.pagopa.pn_doc.model.notification.timeline;

import it.pagopa.pn_doc.model.notification.NotificationAttachment;
import it.pagopa.pn_doc.model.notification.NotificationRecipient;
import it.pagopa.pn.model.notification.timeline.IReceivedDetails;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ReceivedDetails implements IReceivedDetails<NotificationRecipient> {

    private NotificationAttachment.Digests digests;
    private List<NotificationRecipient> recipients;

}
