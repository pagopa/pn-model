package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.EventType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EventTypeTests {

    @Test
    void testEnum() {
        assertNotNull(EventType.NEW_NOTIFICATION);
        assertNotNull(EventType.NOTIFICATION_PAID);
        assertNotNull(EventType.NOTIFICATION_VIEWED);
        assertNotNull(EventType.SEND_COURTESY_EMAIL);
        assertNotNull(EventType.SEND_PAPER_REQUEST);
        assertNotNull(EventType.SEND_PAPER_RESPONSE);
        assertNotNull(EventType.SEND_PEC_REQUEST);
        assertNotNull(EventType.SEND_PEC_RESPONSE);
        assertNotNull(EventType.SEND_ONBOARDING_REQUEST);
    }
}
