package it.pagopa.pn.api.dto.addressbook;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    @Schema( description = "Indirizzi recapito digitale utilizzabili per la persona indicata dal TaxId" )
    private List<DigitalAddress> courtesyAddresses;

    @Schema( description = "Indirizzo recapito analogico per la persona indicata dal TaxId")
    private PhysicalAddress residentialAddress;
}
