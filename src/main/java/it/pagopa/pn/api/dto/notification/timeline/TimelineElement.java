package it.pagopa.pn.api.dto.notification.timeline;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder(toBuilder = true)
public class TimelineElement {

    @Schema( name = "timestamp", description = "Momento in cui avviene l'evento desritto in questo elemento di timeline")
    private Instant timestamp;

    @Schema( name = "eventCategory", description = "tipo di evento registrato")
    private TimelineElementEventCategory eventCategory;

    @Schema( name = "details", description = "dettagli sull'evento: variano in base al \"eventCategory\"",
            oneOf = {
                ReceivedDetails.class,
                NotificationPathChooseDetails.class,
                SendDigitalDetails.class,
                SendDigitalFeedbackDetails.class
            }
    )
    private TimelineElementDetails details;

}

