package it.pagopa.pn.api.dto.status;

import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ResponseUpdateStatusDto {
    private NotificationStatus currentStatus;
    private NotificationStatus nextStatus;
}