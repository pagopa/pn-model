package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PnF24PdfSetReadyEventItem {
    private String pathTokens;
    private String uri;
    private String errorCode;
}
