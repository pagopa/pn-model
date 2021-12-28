package it.pagopa.pn.api.dto.extchannel;

import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public abstract class ExtChannelResponse {
    private String iun;
    private String taxId;
    private Instant notificationDate;
    private ExtChannelResponseStatus responseStatus;
    private List<String> errorList;
    private DigitalAddress digitalUsedAddress;
    private List<String> attachmentKeys;
    private PhysicalAddress analogUsedAddress;
    private PhysicalAddress analogNewAddressFromInvestigation;

}
