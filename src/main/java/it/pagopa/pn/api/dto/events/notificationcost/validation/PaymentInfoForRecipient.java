package it.pagopa.pn.api.dto.events.notificationcost.validation;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PaymentInfoForRecipient {
    private Integer recIndex;
    private String iuv;
    private boolean applyCost;
}

