package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.paperDeliveryCommunicationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PaperDeliveryCommunicationTypeTests {

    @Test
    void testEnum() {
        assertNotNull(paperDeliveryCommunicationType.INFORMAL);
        assertNotNull(paperDeliveryCommunicationType.LEGAL);
    }
}
