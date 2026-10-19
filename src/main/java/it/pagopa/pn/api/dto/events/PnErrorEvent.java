package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PnErrorEvent implements GenericEvent<StandardEventHeader, PnErrorEvent.Payload>, GenericEventBridgeEvent<PnErrorEvent.Detail> {

    private StandardEventHeader header;

    private PnErrorEvent.Payload payload;

    private PnErrorEvent.Detail detail;

    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Payload {

        private String originalMessage;

        private String description;

        private Instant timestamp;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder(toBuilder = true)
    @ToString
    @EqualsAndHashCode
    public static class Detail {
        String clientId;
        Payload PnErrorEventPayload;
    }
}
