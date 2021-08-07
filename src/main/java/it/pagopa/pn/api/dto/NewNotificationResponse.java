package it.pagopa.pn.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder( toBuilder = true )
public class NewNotificationResponse {

    @Schema( name = "iun", description = "Identificativo Univoco Notifica con cui la notifica appena inviata verrà identificata nel processo di notificazione")
    private String iun;

    @Schema( name = "paNotificationId", description = "Identificativo inviato dalla pubblica amministrazione")
    private String paNotificationId;

}
