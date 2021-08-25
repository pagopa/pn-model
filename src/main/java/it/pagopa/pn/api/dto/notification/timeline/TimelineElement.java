package it.pagopa.pn.api.dto.notification.timeline;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

    // - Today (2021-08-25) this entity is planned to be used only as child of Notification.
    //   This field is not useful because it is a repetition of the notification iun.
    @JsonIgnore
    private String iun;

    @Schema( description = "Insieme allo IUN della notifica definisce in maniera univoca l'elemento di timeline")
    private String elementId;

    @Schema( description = "Momento in cui avviene l'evento desritto in questo elemento di timeline")
    private Instant timestamp;

    @Schema( description = "tipo di evento registrato")
    private TimelineElementCategory category;

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

