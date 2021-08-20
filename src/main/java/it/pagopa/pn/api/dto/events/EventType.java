package it.pagopa.pn.api.dto.events;

public enum EventType {
    NEW_NOTIFICATION(PnDeliveryNewNotificationEvent.class),
    SEND_PEC_REQUEST(PnExtChnPecEvent.class),
    SEND_PEC_RESPONSE(PnExtChnProgressStatusEvent.class);


    private final Class<?> eventClass;

    EventType(Class<?> eventClass) {
        this.eventClass = eventClass;
    }

    public Class<?> getEventClass() {
        return eventClass;
    }
}
