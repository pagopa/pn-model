package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PublicRegistryResponseDetails implements RecipientRelatedTimelineElementDetails {//NEW
    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Index destinatario notifica digitale")
    private int recIndex;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Indirizzo digitale ottenuto in risposta")
    private DigitalAddress digitalAddress;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Indirizzo fisico ottenuto in risposta")
    private PhysicalAddress physicalAddress;
}
