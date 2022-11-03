package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.ServiceLevelType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ServiceLevelTypeTests {

    @Test
    void testEnum() {
        assertNotNull(ServiceLevelType.REGISTERED_LETTER_890);
        assertNotNull(ServiceLevelType.SIMPLE_REGISTERED_LETTER);
    }
}
