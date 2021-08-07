package it.pagopa.pn.api.dto.notification.address;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class DigitalAddress {

    @Schema( name = "type", description = "tipo di indirizzo PEC, REM, SERCQ, ..." )
    private DigitalAddressType type;

    @Schema( name = "address", description = "account@domain" )
    private String address;

}
