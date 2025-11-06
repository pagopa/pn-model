package it.pagopa.pn.api.dto.events;

import java.util.List;

public interface MomProducer<T extends GenericEvent> {

    void push(List<T> messages);
    void push(List<T> msges, Integer delaySeconds);

    void push(T message);
    void push(T message, Integer delaySeconds);

}
