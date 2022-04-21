package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.DigitalAddressSource;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(builderMethodName = "sendBuilder", toBuilder = true)
@EqualsAndHashCode
@ToString
public class SendDigitalDetails implements RecipientRelatedTimelineElementDetails {

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Index destinatario notifica digitale")
    private int recIndex;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "indirizzo di invio della notifica")
    private DigitalAddress address;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "sorgente indirizzo di invio della notifica")
    private DigitalAddressSource addressSource;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "numero dei tentativi effettuati")
    private Integer retryNumber;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "identificativo del messaggio nel sistema a valle")
    private DownstreamId downstreamId;

}
