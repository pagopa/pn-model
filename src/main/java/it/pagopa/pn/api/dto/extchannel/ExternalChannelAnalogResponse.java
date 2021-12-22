package it.pagopa.pn.api.dto.extchannel;

import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ExternalChannelAnalogResponse extends ExtChannelResponse {
    private PhysicalAddress usedAddress;
    private PhysicalAddress newAddressFromInvestigation;
    private List<String> attachmentKeys;
}
