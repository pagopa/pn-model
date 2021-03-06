package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Builder(builderMethodName = "sendPaperFeedbackBuilder")
@EqualsAndHashCode(callSuper = true)
@ToString
public class SendPaperFeedbackDetails extends SendPaperDetails {

    public SendPaperFeedbackDetails(SendPaperDetails spd, PhysicalAddress newAddress, List<String> errors) {
        super(spd.getTaxId(), spd.getRecIndex(), spd.getAddress(), spd.getServiceLevel(), spd.getSentAttemptMade(), spd.isInvestigation());
        this.newAddress = newAddress;
        this.errors = errors;
    }
    
    //TODO Da eliminare quando verrò utilizzato il codice del refactoring il sentAttemptMade a 0 è stato inserito solo per poter effettuare la build
    public SendPaperFeedbackDetails(PhysicalAddress newAddress, List<String> errors) {
        super(null, 0, null, null, 0, false);
        this.newAddress = newAddress;
        this.errors = errors;
    }

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Indirizzo fisico scoperto durante fase di consegna")
    private PhysicalAddress newAddress;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Lista errori, vuota in caso di successo")
    private List<String> errors;


}
