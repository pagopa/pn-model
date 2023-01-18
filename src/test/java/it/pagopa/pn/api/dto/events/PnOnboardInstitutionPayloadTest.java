package it.pagopa.pn.api.dto.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PnOnboardInstitutionPayloadTest {


    @Test
    void additionMethodsAreNotNull() {
        PnOnboardInstitutionPayload payload = new PnOnboardInstitutionPayload();
        payload.setPk("the-pk");
        payload.setStatus(PnOnboardInstitutionPayload.STATUS_ACTIVE);

        assertThat(payload.isActive()).isTrue();
        assertThat(payload.getInstitutionId()).isEqualTo(payload.getPk());
    }
}
