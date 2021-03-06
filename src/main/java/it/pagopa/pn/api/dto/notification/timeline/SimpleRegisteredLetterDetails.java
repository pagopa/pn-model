package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class SimpleRegisteredLetterDetails implements RecipientRelatedTimelineElementDetails {//NEW
    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Index destinatario notifica digitale")
    private int recIndex;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "indirizzo fisico di invio della notifica")
    private PhysicalAddress address;

}
