package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class SenderInfo {

    @Schema(name = "paDenomination", description = "Denominazione della PA mittente")
    private String paDenomination;

    @Schema(name = "paCf", description = "Codice Fiscale della PA mittente")
    private String paCf;
}
