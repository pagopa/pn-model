package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class RecipientInfoWithAddresses {

    @Schema(name = "denomination", description = "Denominazione di un destinatario")
    private String denomination;

    @Schema(name = "cf", description = "Codice fiscale di un destinatario")
    private String cf;

    @Schema(name = "digitalDomicile", description = "Rappresentazione in stringa del domicilio digitale destnatario")
    private String digitalDomicile;

    @Schema(name = "physicalDomicile", description = "domicilio fisico del destinatario")
    private String physicalDomicile;
}
