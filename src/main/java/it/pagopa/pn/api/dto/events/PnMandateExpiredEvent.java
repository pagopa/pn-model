package it.pagopa.pn.api.dto.events;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnMandateExpiredEvent implements GenericFifoEvent<StandardEventHeader, PnMandateExpiredEvent.Payload> {

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
        private String mandateId;
        private String delegatorInternalUserid;
    }

}
