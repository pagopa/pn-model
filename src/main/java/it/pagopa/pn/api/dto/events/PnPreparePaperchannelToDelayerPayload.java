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
    private String senderPaId;
    private String tenderId;
    private String recipientId;
    private String unifiedDeliveryDriver;
    private Integer attempt;
    private String notificationSentAt;
    private String prepareRequestDate;
    private PnAddressItem recipientNormalizedAddress;
}
