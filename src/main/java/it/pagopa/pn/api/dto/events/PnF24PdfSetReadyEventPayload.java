package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PnF24PdfSetReadyEventPayload {
    private String requestId;
    private String status;
    private List<PnF24PdfSetReadyEventItem> generatedPdfsUrls;
}
