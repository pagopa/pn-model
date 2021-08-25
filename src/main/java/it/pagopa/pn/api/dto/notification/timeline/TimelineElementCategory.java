package it.pagopa.pn.api.dto.notification.timeline;

public enum TimelineElementCategory {
    RECEIVED_ACK( ReceivedDetails.class ),
    NOTIFICATION_PATH_CHOOSE( NotificationPathChooseDetails.class ),
    SEND_DIGITAL_DOMICILE( SendDigitalDetails.class ),
    SEND_DIGITAL_DOMICILE_FEEDBACK( SendDigitalFeedbackDetails.class );

    private final Class< ? extends TimelineElementDetails> detailsJavaClass;

    private TimelineElementCategory(Class<? extends TimelineElementDetails> detailsJavaClass) {
        this.detailsJavaClass = detailsJavaClass;
    }

    public Class< ? extends TimelineElementDetails> getDetailsJavaClass() {
        return this.detailsJavaClass;
    }
}
