package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnAttachmentsConfigEvent implements GenericEvent<GenericEventHeader, PnConfigAttachmentsEventPayload> {

    private GenericEventHeader header;
    private PnConfigAttachmentsEventPayload payload;
}
