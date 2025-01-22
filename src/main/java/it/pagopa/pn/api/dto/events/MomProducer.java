package it.pagopa.pn.api.dto.events;

import java.util.Collections;
import java.util.List;

public interface MomProducer<T extends GenericEvent> {

    void push(List<T> messages);
    void push(List<T> msges, Integer delaySeconds);

    default void push(T message) {
        push( Collections.singletonList( message ));
    }
    default void push(T message, Integer delaySeconds) {
        push( Collections.singletonList( message ), delaySeconds);
    }

}
