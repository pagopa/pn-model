package it.pagopa.pn.model.notification.timeline;

import it.pagopa.pn.model.notification.INotificationAttachmentDigests;
import it.pagopa.pn.model.notification.INotificationRecipient;

import java.util.List;

public interface IReceivedDetails<T extends INotificationRecipient> extends TimelineElementDetails {

    INotificationAttachmentDigests getDigests();
    List<T> getRecipients();

}
