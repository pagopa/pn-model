package it.pagopa.pn.api.dto.notification.timeline;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.events.ServiceLevelType;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Builder(builderMethodName = "sendPaperFeedbackBuilder" )
@EqualsAndHashCode( callSuper = true )
@ToString
public class SendPaperFeedbackDetails extends SendPaperDetails {


  public SendPaperFeedbackDetails( SendPaperDetails spd, PhysicalAddress newAddress, List<String> errors) {
	  super( spd.getTaxId(), spd.getAddress(), spd.getServiceLevel());
      this.newAddress = newAddress;
	  this.errors = errors;
  }
	
    public SendPaperFeedbackDetails( String taxId, PhysicalAddress address, ServiceLevelType serviceLevel, PhysicalAddress newAddress, List<String> errors) {
        super( taxId, address, serviceLevel);
        this.newAddress = newAddress;
        this.errors = errors;
    }

    public SendPaperFeedbackDetails(PhysicalAddress newAddress, List<String> errors) {
        super( null, null, null );
        this.newAddress = newAddress;
        this.errors = errors;
    }

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Indirizzo fisico scoperto durante fase di consegna")
    private PhysicalAddress newAddress;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Lista errori, vuota in caso di successo")
    private List<String> errors;

}
