package it.pagopa.pn.model.notification;


import it.pagopa.pn.model.notification.status.INotificationStatusHistoryElement;
import it.pagopa.pn.model.notification.status.NotificationStatus;
import it.pagopa.pn.model.notification.timeline.ITimelineElement;

import java.util.List;

public interface INotification<
        R extends INotificationRecipient,
        A extends INotificationAttachment,
        S extends INotificationStatusHistoryElement,
        T extends ITimelineElement > {

    String getIun();
    String getPaNotificationId();
    String getSubject();
    String getCancelledIun();
    String getCancelledByIun();
    INotificationSender getSender();
    List<R> getRecipients();
    List<A> getDocuments();
    INotificationPaymentInfo getPayment();
    NotificationStatus getNotificationStatus();
    List<S> getNotificationStatusHistory();
    List<T> getTimeline();

}
