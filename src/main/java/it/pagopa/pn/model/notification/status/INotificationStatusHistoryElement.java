package it.pagopa.pn.model.notification.status;

import java.time.Instant;

public interface INotificationStatusHistoryElement {

    NotificationStatus getStatus();
    Instant getActiveFrom();
}
