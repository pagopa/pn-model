package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@Builder(toBuilder = true)
public class RecipientInfo {

    @Schema(name = "denomination", description = "Denominazione di un destinatario")
    protected String denomination;

    @Schema(name = "cf", description = "Codice fiscale di un destinatario")
    protected String cf;

}
