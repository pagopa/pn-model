package it.pagopa.pn.api.dto.events;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnPtDelegationEvent implements GenericEvent<StandardEventHeader, PnPtDelegationPayload> {

    private StandardEventHeader header;
    private PnPtDelegationPayload payload;
}
