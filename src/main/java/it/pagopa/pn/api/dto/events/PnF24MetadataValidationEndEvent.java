package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnF24MetadataValidationEndEvent implements GenericEventBridgeEvent<PnF24MetadataValidationEndEvent.Detail> {
    private Detail detail;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Detail {
        String cxId;
        String clientId;
        PnF24MetadataValidationEndEventPayload metadataValidationEnd;
    }
}
