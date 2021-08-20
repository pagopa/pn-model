package it.pagopa.pn.api.dto.notification.timeline;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class TimelineElement {

    @Schema( description = "Momento in cui avviene l'evento desritto in questo elemento di timeline")
    private Instant timestamp;

    @Schema( description = "tipo di evento registrato")
    private TimelineElementEventCategory eventCategory;

    @Schema( description = "dettagli sull'evento: variano in base al \"eventCategory\"",
            oneOf = {
                ReceivedDetails.class,
                NotificationPathChooseDetails.class,
                SendDigitalDetails.class,
                SendDigitalFeedbackDetails.class
            }
    )
    private TimelineElementDetails details;

}

