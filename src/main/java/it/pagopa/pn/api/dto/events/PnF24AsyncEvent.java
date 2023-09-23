package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnF24AsyncEvent implements GenericEvent<PnF24EventHeader, PnF24AsyncEvent.Payload> {
    private PnF24EventHeader header;
    private Payload payload;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Payload {
        String cxId;
        PnF24PdfSetReadyEventPayload pdfSetReady;
        PnF24MetadataValidationEndEventPayload metadataValidationEnd;
    }
}
