package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnPreparePaperchannelToDelayerEvent implements GenericEvent<StandardEventHeader, PnPreparePaperchannelToDelayerPayload> {

    private StandardEventHeader header;
    private PnPreparePaperchannelToDelayerPayload payload;
}
