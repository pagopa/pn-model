package it.pagopa.pn.api.dto.events.notificationcost.validation;

import it.pagopa.pn.api.dto.events.notificationcost.utils.ValidationStatus;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
