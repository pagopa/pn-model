package it.pagopa.pn.api.dto.addressbook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class AddressBookEntry {

    @Schema( description = "Codice fiscale della persona fisica o giuridica" )
    private String taxId;

    @Schema( description = "Indirizzi digitali utilizzabili per la persona indicata dal TaxId" )
    private DigitalAddresses digitalAddresses;

}
