package it.pagopa.pn.api.dto.notification.timeline;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class TimelineInfoDto {
    private String elementId;
    private TimelineElementCategory category;
    private Instant timestamp;
}
