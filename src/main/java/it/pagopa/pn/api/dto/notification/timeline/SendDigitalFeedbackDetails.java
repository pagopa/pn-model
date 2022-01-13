package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.DigitalAddressSource;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Builder(builderMethodName = "sendFeedbackBuilder")
@EqualsAndHashCode(callSuper = true)
@ToString
public class SendDigitalFeedbackDetails extends SendDigitalDetails {


    public SendDigitalFeedbackDetails(String fc, DigitalAddress address, DigitalAddressSource addressSource, Integer retryNumber, DownstreamId downstreamId, List<String> errors) {
        super(fc, address, addressSource, retryNumber, downstreamId);
        this.errors = errors;
    }

    public SendDigitalFeedbackDetails(SendDigitalDetails sdd, List<String> errors) {
        super(sdd.getTaxId(), sdd.getAddress(), sdd.getAddressSource(), sdd.getRetryNumber(), sdd.getDownstreamId());
        this.errors = errors;
    }

    public SendDigitalFeedbackDetails(List<String> errors) {
        super(null, null, null, null, null);
        this.errors = errors;
    }

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Lista errori, vuota in caso di successo")
    private List<String> errors;

}
