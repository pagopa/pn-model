package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnDeliveryNotificationViewedEvent implements GenericFifoEvent<StandardEventHeader, PnDeliveryNotificationViewedEvent.Payload>,
        GenericEventBridgeEvent<PnDeliveryNotificationViewedEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;

    private String messageDeduplicationId;

    private String messageGroupId;

    @Override
    public Payload getDetail() {
        return payload;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {

        private String iun;
        private int recipientIndex;
        private NotificationViewDelegateInfo delegateInfo;
        private Instant viewedDate;
        private String sourceChannel;
        private String sourceChannelDetails;
    }
}
