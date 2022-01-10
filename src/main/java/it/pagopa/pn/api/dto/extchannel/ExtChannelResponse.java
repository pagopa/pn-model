package it.pagopa.pn.api.dto.extchannel;

import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
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
    private String taxId;
    private String eventId;
    private Instant notificationDate;
    private ExtChannelResponseStatus responseStatus;
    private List<String> errorList;
    private DigitalAddress digitalUsedAddress;
    private List<String> attachmentKeys;
    private PhysicalAddress analogUsedAddress;
    private PhysicalAddress analogNewAddressFromInvestigation;

}
