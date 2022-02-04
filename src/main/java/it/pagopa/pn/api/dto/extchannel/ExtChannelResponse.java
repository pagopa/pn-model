package it.pagopa.pn.api.dto.extchannel;

import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ExtChannelResponse {
    private String iun;
    private String eventId;
    private Instant notificationDate;
    private ExtChannelResponseStatus responseStatus;
    private List<String> errorList;
    private List<String> attachmentKeys;
    private PhysicalAddress analogNewAddressFromInvestigation;
}
