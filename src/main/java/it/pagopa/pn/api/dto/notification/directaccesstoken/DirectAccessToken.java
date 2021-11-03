package it.pagopa.pn.api.dto.notification.directaccesstoken;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class DirectAccessToken {
    @Schema( description = "Token univoco relativo alla notifica e al destinatario")
    private String token;

    @Schema( description = "L'Identificativo Univoco Notifica assegnato da PN")
    private String iun;

    @Schema( description = "Codice Fiscale del destinatario")
    private String taxId;
}
