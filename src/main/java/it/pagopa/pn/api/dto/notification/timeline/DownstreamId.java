package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class DownstreamId {

    @Schema( description = "Identificativo del sistema a valle di inoltro messaggistica")
    private String systemId;

    @Schema( description = "Identificativo del messaggio inoltrato")
    private String messageId;

}
