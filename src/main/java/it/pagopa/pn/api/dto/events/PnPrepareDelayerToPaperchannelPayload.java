package it.pagopa.pn.api.dto.events;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class PnPrepareDelayerToPaperchannelPayload {

    private String requestId;
    private String iun;
    private int attempt;
    private String clientId;
}
