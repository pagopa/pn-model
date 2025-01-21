package it.pagopa.pn.api.dto.events;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class PnPreparePaperchannelToDelayerPayload {

    private String requestId;
    private String iun;
    private String productType;
    private PnAddressItem recipientNormalizedAddress;
}
