package it.pagopa.pn_doc.model.notification.address;

import it.pagopa.pn.model.notification.address.DigitalAddressType;
import it.pagopa.pn.model.notification.address.IDigitalAddress;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DigitalAddress implements IDigitalAddress {

    private DigitalAddressType type;
    private String address;

}
