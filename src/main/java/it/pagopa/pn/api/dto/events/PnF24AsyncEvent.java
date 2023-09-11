package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnF24AsyncEvent implements GenericEventBridgeEvent<PnF24AsyncEvent.Detail> {
    private Detail detail;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Detail {
        String cxId;
        PnF24PdfSetReadyEventPayload pdfSetReady;
        PnF24MetadataValidationEndEventPayload metadataValidationEnd;
    }
}
