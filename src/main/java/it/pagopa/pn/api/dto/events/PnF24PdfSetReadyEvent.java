package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnF24PdfSetReadyEvent implements GenericEventBridgeEvent<PnF24PdfSetReadyEvent.Detail> {
    private Detail detail;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Detail implements DetailedTypePayload  {
        String clientId;
        PnF24PdfSetReadyEventPayload pdfSetReady;
    }
}
