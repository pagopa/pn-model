package it.pagopa.pn.api.dto.events;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnDeliveryNewNotificationEvent implements GenericEvent<StandardEventHeader, PnDeliveryNewNotificationEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;


    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {

        //Codice IPA della PA mittente
        private String paId;
    }
}
