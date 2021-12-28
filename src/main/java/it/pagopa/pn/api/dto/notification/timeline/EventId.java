package it.pagopa.pn.api.dto.notification.timeline;

import it.pagopa.pn.api.dto.notification.address.DigitalAddressSource2;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class EventId {
    private String iun;
    private String recipientId;
    private DigitalAddressSource2 source;
    private int index;
}
