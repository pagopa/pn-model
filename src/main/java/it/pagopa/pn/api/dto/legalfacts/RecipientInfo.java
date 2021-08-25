package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class RecipientInfo {

    @Schema( description = "Denominazione di un destinatario")
    protected String denomination;

    @Schema( description = "Codice fiscale di un destinatario")
    protected String taxId;

}
