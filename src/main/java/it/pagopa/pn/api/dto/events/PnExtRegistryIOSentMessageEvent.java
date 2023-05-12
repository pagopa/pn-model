package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnExtRegistryIOSentMessageEvent implements GenericFifoEvent<StandardEventHeader, PnExtRegistryIOSentMessageEvent.Payload> {

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

        private String iun;

        private int recIndex;

        private String internalId;

        private Instant sendDate;
    }
}
