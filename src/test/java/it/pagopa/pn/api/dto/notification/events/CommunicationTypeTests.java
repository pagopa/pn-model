package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.CommunicationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommunicationTypeTests {

    @Test
    void testEnum() {
        assertNotNull(CommunicationType.RECIEVED_DELIVERY_NOTICE);
        assertNotNull(CommunicationType.FAILED_DELIVERY_NOTICE);
    }
}
