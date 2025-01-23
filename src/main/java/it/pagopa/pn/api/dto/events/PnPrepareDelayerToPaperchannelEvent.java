package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnPrepareDelayerToPaperchannelEvent implements GenericEvent<StandardEventHeader, PnPrepareDelayerToPaperchannelPayload> {

    private StandardEventHeader header;
    private PnPrepareDelayerToPaperchannelPayload payload;
}