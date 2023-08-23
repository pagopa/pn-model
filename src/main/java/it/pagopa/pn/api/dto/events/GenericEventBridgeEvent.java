package it.pagopa.pn.api.dto.events;

public interface GenericEventBridgeEvent<T> {
    T getDetail();
}
