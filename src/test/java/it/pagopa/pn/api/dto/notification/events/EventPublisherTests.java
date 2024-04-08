package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.EventPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EventPublisherTests {

    @Test
    void testEnum() {
        assertNotNull(EventPublisher.DELIVERY);
        assertNotNull(EventPublisher.DELIVERY_PUSH);
        assertNotNull(EventPublisher.EXTERNAL_CHANNELS);
        assertNotNull(EventPublisher.EXTERNAL_REGISTRY);
        assertNotNull(EventPublisher.KAFKA_BRIDGE);
        assertNotNull(EventPublisher.MANDATE);
        assertNotNull(EventPublisher.F24);
        assertNotNull(EventPublisher.RADD_ALT);
    }
}
