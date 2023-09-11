package it.pagopa.pn.api.dto.events;

public enum EventType implements IEventType {
    NEW_NOTIFICATION( PnDeliveryNewNotificationEvent.class ),
    NOTIFICATION_VIEWED( PnDeliveryNotificationViewedEvent.class ),
    NOTIFICATION_PAID( PnExtRegistryNotificationPaidEvent.class ),
    SEND_IO_MESSAGE_REQUEST( PnExtRegistryIOSentMessageEvent.class ),
    SEND_PEC_REQUEST( PnExtChnPecEvent.class ),
    SEND_PEC_RESPONSE( PnExtChnProgressStatusEvent.class ),
    SEND_COURTESY_EMAIL ( PnExtChnEmailEvent.class ),
    SEND_PAPER_REQUEST ( PnExtChnPaperEvent.class ),
    SEND_PAPER_RESPONSE ( PnDeliveryPaymentEvent.class ),
    SEND_ONBOARDING_REQUEST (PnOnboardingInstitutionEvent.class),
    MANDATE_ACCEPTED (PnMandateEvent.class),
    MANDATE_UPDATED (PnMandateEvent.class),
    MANDATE_REVOKED (PnMandateEvent.class),
    MANDATE_REJECTED (PnMandateEvent.class),
    MANDATE_EXPIRED (PnMandateEvent.class);
    
    private final Class<?> eventClass;

    EventType( Class<?> eventClass) {
        this.eventClass = eventClass;
    }

    public Class<?> getEventJavaClass() {
        return eventClass;
    }
}
