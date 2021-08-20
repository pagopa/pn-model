package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationPathChooseDetails {

    @Schema( description = "codice fiscale destinatario")
    String taxId;

    @Schema( description = "specifica se la notifica al destinatario segue il percorso analogico o quello digitale")
    DeliveryMode deliveryMode;

}
