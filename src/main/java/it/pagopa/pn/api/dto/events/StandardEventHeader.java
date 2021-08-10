package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class StandardEventHeader {

    @Schema( name = "publisher", description = "L'applicazione che ha creato l'evento")
    private String publisher;

    @Schema( name = "eventId", description = "Identificativo univoco deterministico dell'evento, determinato dallo iun e dal payload dell'evento")
    private String eventId;

    @Schema( name = "eventType", description = "")
    private EventType eventType;

    @Schema( name = "iun", description = "Un messaggio è sempre collegato a una notifica")
    private String iun;

    @Schema( name = "createdAt", description = "Istante di creazione del messaggio")
    private Instant createdAt;
}
