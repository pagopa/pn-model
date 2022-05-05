package it.pagopa.pn.api.dto.notification.timeline;

import it.pagopa.pn.api.dto.notification.status.NotificationStatusHistoryElement;
import lombok.*;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class TimelineStatusHistoryDto {
    private Set<TimelineElement> timelineElements;
    private List<NotificationStatusHistoryElement> statusHistory;
}
