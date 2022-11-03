package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.EndWorkflowStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EndWorkflowStatusTests {

    @Test
    void testEnum() {
        assertNotNull(EndWorkflowStatus.FAILURE);
        assertNotNull(EndWorkflowStatus.SUCCESS);
    }
}
