package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class RecipientInfoWithAddresses {

    @Schema( description = "Denominazione di un destinatario")
    private String denomination;

    @Schema( description = "Codice fiscale di un destinatario")
    private String taxId;

    @Schema( description = "Rappresentazione in stringa del domicilio digitale destnatario")
    private String digitalDomicile;

    @Schema( description = "domicilio fisico del destinatario")
    private String physicalDomicile;
}
