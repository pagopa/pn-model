package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonView;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class EndOfDigitalDeliveryWorkflowDetails implements TimelineElementDetails {

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

}
