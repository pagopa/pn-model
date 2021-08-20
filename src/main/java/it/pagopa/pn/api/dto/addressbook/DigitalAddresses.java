package it.pagopa.pn.api.dto.addressbook;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class DigitalAddresses {

    @Schema(name = "platform", description = "Indirizzo digitale di piattaforma")
    private DigitalAddress platform;

    @Schema(name = "general", description = "Indirizzo digitale generale")
    private DigitalAddress general;
}
