package it.pagopa.pn.api.dto.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PnOnboardInstitutionPayloadTest {


    @Test
    void additionMethodsAreNotNull() {
        PnOnboardInstitutionPayload payload = new PnOnboardInstitutionPayload();
        payload.setId("the-pk");
        payload.setStatus(PnOnboardInstitutionPayload.STATUS_ACTIVE);

        assertThat(payload.isActive()).isTrue();
        assertThat(payload.getInstitutionId()).isEqualTo(payload.getId());

        payload.setStatus(PnOnboardInstitutionPayload.STATUS_SUSPENDED);
        assertThat(payload.isActive()).isFalse();

        payload.setStatus(null);
        assertThat(payload.isActive()).isFalse();
    }
}
