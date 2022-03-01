package it.pagopa.pn.api.dto.status;

import it.pagopa.pn.api.dto.notification.timeline.TimelineElement;
import it.pagopa.pn.api.dto.notification.timeline.TimelineInfoDto;
import lombok.*;

import javax.validation.constraints.Pattern;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class RequestUpdateStatusDto {

    @Pattern( regexp = "[A-Za-z0-9-_]+")
    private String iun;

    private Set<TimelineInfoDto> currentTimeline;
    private TimelineInfoDto newTimelineElement;
}
