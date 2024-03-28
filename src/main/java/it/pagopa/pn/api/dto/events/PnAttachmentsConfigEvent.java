package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnAttachmentsConfigEvent implements GenericEvent<GenericEventHeader, PnAttachmentsConfigEventPayload> {

    private GenericEventHeader header;
    private PnAttachmentsConfigEventPayload payload;
}
