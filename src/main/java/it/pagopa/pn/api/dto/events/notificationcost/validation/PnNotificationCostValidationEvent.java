package it.pagopa.pn.api.dto.events.notificationcost.validation;

import it.pagopa.pn.api.dto.events.GenericEventBridgeEvent;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnNotificationCostValidationEvent implements GenericEventBridgeEvent<PnNotificationCostValidationEvent.Detail> {
    private Detail detail;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Detail {
        String clientId;
        PnNotificationCostValidationEventPayload pnNotificationCostValidationPayload;
    }
}
