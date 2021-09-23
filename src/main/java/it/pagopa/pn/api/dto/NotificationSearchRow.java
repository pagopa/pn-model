package it.pagopa.pn.api.dto;

import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationSearchRow {
    //TODO description
    private String iun;
    private String paNotificationId;
    private String senderId;
    private Instant sentAt;
    private String subject;
    private NotificationStatus notificationStatus;
    private String recipientId;

}
