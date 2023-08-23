package it.pagopa.pn.api.dto.events;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnF24PdfSetReadyEvent implements GenericEventBridgeEvent<PnF24PdfSetReadyEventDetail> {
    private PnF24PdfSetReadyEventDetail detail;
}
