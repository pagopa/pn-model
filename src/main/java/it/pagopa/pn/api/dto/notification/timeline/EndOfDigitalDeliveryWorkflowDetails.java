package it.pagopa.pn.api.dto.notification.timeline;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
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

    @Schema( description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

}
