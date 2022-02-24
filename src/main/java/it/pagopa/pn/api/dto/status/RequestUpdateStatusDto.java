package it.pagopa.pn.api.dto.status;

import it.pagopa.pn.api.dto.notification.timeline.TimelineElement;
import it.pagopa.pn.api.dto.notification.timeline.TimelineInfoDto;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class RequestUpdateStatusDto {
    private String iun;
    private Set<TimelineInfoDto> currentTimeline;
    private TimelineInfoDto newTimelineElement;
}
