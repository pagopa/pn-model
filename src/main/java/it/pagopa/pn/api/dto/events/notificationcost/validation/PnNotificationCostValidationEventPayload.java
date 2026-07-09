package it.pagopa.pn.api.dto.events.notificationcost.validation;

import it.pagopa.pn.api.dto.events.notificationcost.utils.ValidationStatus;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnNotificationCostValidationEventPayload {
    @NotEmpty
    private String iun;
    @NotNull
    private ValidationStatus status;

}
