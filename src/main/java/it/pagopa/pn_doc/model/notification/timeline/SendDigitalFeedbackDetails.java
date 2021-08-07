package it.pagopa.pn_doc.model.notification.timeline;

import it.pagopa.pn.model.notification.timeline.ISendDigitalFeedbackDetails;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder(builderMethodName = "subBuilder") // @Builder va in conflitto con builder superclasse
public class SendDigitalFeedbackDetails extends SendDigitalDetails implements ISendDigitalFeedbackDetails {

    public SendDigitalFeedbackDetails() {
        super( null, null, null, null);
        this.errors = null;
    }

    public SendDigitalFeedbackDetails(List<String> errors) {
        super( null, null, null, null);
        this.errors = errors;
    }

    private List<String> errors;

}
