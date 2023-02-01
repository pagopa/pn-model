package it.pagopa.pn.api.dto.events;

public enum EventType implements IEventType {
    NEW_NOTIFICATION( PnDeliveryNewNotificationEvent.class ),
    NOTIFICATION_VIEWED( PnDeliveryNotificationViewedEvent.class ),
    NOTIFICATION_PAID( PnExtRegistryNotificationPaidEvent.class ),
    SEND_PEC_REQUEST( PnExtChnPecEvent.class ),
    SEND_PEC_RESPONSE( PnExtChnProgressStatusEvent.class ),
    SEND_COURTESY_EMAIL ( PnExtChnEmailEvent.class ),
    SEND_PAPER_REQUEST ( PnExtChnPaperEvent.class ),
    SEND_PAPER_RESPONSE ( PnExtChnProgressStatusEvent.class ),
    SEND_ONBOARDING_REQUEST (PnOnboardingInstitutionEvent.class),
    MANDATE_EXPIRED (PnMandateExpiredEvent.class);
    
    private final Class<?> eventClass;

    EventType( Class<?> eventClass) {
        this.eventClass = eventClass;
    }

    public Class<?> getEventJavaClass() {
        return eventClass;
    }
}
