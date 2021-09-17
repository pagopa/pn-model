package it.pagopa.pn.api.dto.notification.status;

public enum NotificationStatus {
    RECEIVED,
    DELIVERING,
    DELIVERED,
    VIEWED,
    EFFECTIVE_DATE,//FIXME trovare un nome più esplicativo
    PAID
}
