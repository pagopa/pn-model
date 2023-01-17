package it.pagopa.pn.api.dto.events;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnOnboardingInstitutionEvent implements GenericEvent<StandardEventHeader, PnOnboardInstitutionPayload> {

    private StandardEventHeader header;
    private PnOnboardInstitutionPayload payload;
}
