package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonView;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder( toBuilder = true )
@EqualsAndHashCode
@ToString
public class NotificationViewedDetails implements RecipientRelatedTimelineElementDetails {

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

}
