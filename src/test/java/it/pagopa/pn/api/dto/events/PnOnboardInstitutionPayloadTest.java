package it.pagopa.pn.api.dto.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PnOnboardInstitutionPayloadTest {


    @Test
    void additionMethodsAreNotNull() {
        PnOnboardInstitutionPayload payload = new PnOnboardInstitutionPayload();
        payload.setId("the-pk");
        payload.setStatus(PnOnboardInstitutionPayload.STATUS_ACTIVE);

        assertThat(payload.getStatus()).isEqualTo(PnOnboardInstitutionPayload.STATUS_ACTIVE);
        assertThat(payload.getId()).isEqualTo(payload.getId());

        payload.setStatus(PnOnboardInstitutionPayload.STATUS_SUSPENDED);
        assertThat(payload.getStatus()).isEqualTo(PnOnboardInstitutionPayload.STATUS_SUSPENDED);

        payload.setStatus(null);
        assertThat(payload.getStatus()).isNull();
    }
}
