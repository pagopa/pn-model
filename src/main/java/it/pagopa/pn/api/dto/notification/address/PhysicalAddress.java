package it.pagopa.pn.api.dto.notification.address;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class PhysicalAddress {

    @Schema( name = "at", description = "Campo \"presso\" dell'indirizzo")
    private String at;

    @Schema( name = "address", description = "Indirizzo del domicilio fisico")
    private String address;

    @Schema( name = "addressDetails", description = "Seconda riga dell'indirizzo fisico")
    private String addressDetails;

    @Schema( name = "zip", description = "Codice di avviamento postale")
    private String zip;

    @Schema( name = "municipality", description = "Comune in cui l'indirizzo si trova")
    private String municipality;

    @Schema( name = "province", description = "Provincia in cui si trova l'indirizzo")
    private String province;


}
