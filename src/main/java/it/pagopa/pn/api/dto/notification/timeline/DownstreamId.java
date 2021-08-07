package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class DownstreamId {

    @Schema( name = "systemId", description = "Identificativo del sistema a valle di inoltro messaggistica")
    private String systemId;

    @Schema( name = "messageId", description = "Identificativo del messaggio inoltrato")
    private String messageId;

}
