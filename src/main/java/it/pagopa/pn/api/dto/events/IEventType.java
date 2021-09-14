package it.pagopa.pn.api.dto.events;

public interface IEventType {

    String name();
    Class<?> getEventJavaClass();

}
