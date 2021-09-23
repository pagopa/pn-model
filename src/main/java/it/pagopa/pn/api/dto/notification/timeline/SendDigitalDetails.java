package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(builderMethodName = "sendBuilder", toBuilder = true)
@EqualsAndHashCode
@ToString
public class SendDigitalDetails implements TimelineElementDetails {

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "indirizzo di invio della notifica")
    private DigitalAddress address;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "numero del tentativo")
    private Integer retryNumber;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "identificativo del messaggio nel sistema a valle")
    private DownstreamId downstreamId;

}
