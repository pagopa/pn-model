package it.pagopa.pn.api.dto.notification.timeline;

import it.pagopa.pn.api.dto.notification.address.DigitalAddressSource;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class EventId {//NEW
    private String iun;
    private String recipientId;
    private DigitalAddressSource source;
    private int index;
}
