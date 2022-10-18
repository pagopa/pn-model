package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnDeliveryNotificationViewedEvent implements GenericFifoEvent<StandardEventHeader, PnDeliveryNotificationViewedEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;

    private String messageDeduplicationId;

    private String messageGroupId;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {

        @Schema( description = "Codice IUN notifica")
        private String iun;
        
        @Schema( description = "Indice del reicipient")
        private int recipientIndex;
    }
}
