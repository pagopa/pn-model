package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder( toBuilder = true )
@EqualsAndHashCode
@ToString
public class WaitForRecipientTimeoutDetails implements TimelineElementDetails {

    @Schema( description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

}
