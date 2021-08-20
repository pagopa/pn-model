package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(builderMethodName = "sendBuilder", toBuilder = true)
@EqualsAndHashCode
@ToString
public class SendDigitalDetails {

    @Schema( name = "fc", description = "Codice Fiscale destinatario notifica digitale")
    private String fc;

    @Schema( name = "address", description = "indirizzo di invio della notifica")
    private DigitalAddress address;

    @Schema( name = "retryNumber", description = "numero del tentativo")
    private Integer retryNumber;

    @Schema( name = "downstreamId", description = "identificativo del messaggio nel sistema a valle")
    private DownstreamId downstreamId;

}
