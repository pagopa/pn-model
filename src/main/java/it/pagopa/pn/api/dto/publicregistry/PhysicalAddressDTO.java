package it.pagopa.pn.api.dto.publicregistry;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class PhysicalAddressDTO { //L'address ottenuto da public registry è stato valorizzato con gli stessi campi della classe PhisicalAddress ovviamente per conoscere i campi andrò definita l'interfaccia
    private String at;
    private String address;
    private String addressDetails;
    private String zip;
    private String municipality;
    private String province;
    private String foreignState;
}
