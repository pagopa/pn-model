package it.pagopa.pn.api.dto.notification.status;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder(toBuilder = true)
public class NotificationStatusHistoryElement {

    @Schema( name = "status", description = "Stato di avanzamento del processo di notifica")
    private NotificationStatus status;

    @Schema( name = "activeFrom", description = "data e roa di raggiungimento dello stato di avanzamento")
    private Instant activeFrom;
}
