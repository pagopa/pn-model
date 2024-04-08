package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnEvaluatedZipCodeEvent implements GenericEventBridgeEvent<PnAttachmentsConfigEventPayload> {
    private PnAttachmentsConfigEventPayload detail;
}