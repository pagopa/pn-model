package it.pagopa.pn.api.dto.status;

import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.*;

import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class RequestUpdateStatusDto {

    @Pattern( regexp = "[A-Za-z0-9-_]+")
    private String iun;

    private NotificationStatus nextState;
}
