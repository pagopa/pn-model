package it.pagopa.pn.api.dto.notification.events;

import it.pagopa.pn.api.dto.events.PnExtChnProgressStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PnExtChnProgressStatusTests {

    @Test
    void testEnum() {
        assertNotNull(PnExtChnProgressStatus.OK);
        assertNotNull(PnExtChnProgressStatus.PERMANENT_FAIL);
        assertNotNull(PnExtChnProgressStatus.RETRYABLE_FAIL);
    }
}
