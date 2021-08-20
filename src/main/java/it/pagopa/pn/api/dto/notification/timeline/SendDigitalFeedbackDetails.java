package it.pagopa.pn.api.dto.notification.timeline;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Builder(builderMethodName = "sendFeedbackBuilder" )
@EqualsAndHashCode
@ToString
public class SendDigitalFeedbackDetails extends SendDigitalDetails {


    public SendDigitalFeedbackDetails( String fc, DigitalAddress address, Integer retryNumber, DownstreamId downstreamId, List<String> errors) {
        super( fc, address, retryNumber, downstreamId);
        this.errors = errors;
    }

    public SendDigitalFeedbackDetails( SendDigitalDetails sdd, List<String> errors) {
        super( sdd.getFc(), sdd.getAddress(), sdd.getRetryNumber(), sdd.getDownstreamId() );
        this.errors = errors;
    }

    public SendDigitalFeedbackDetails( List<String> errors) {
        super( null, null, null, null );
        this.errors = errors;
    }

    @Schema( name = "errors", description = "Lista errori, vuota in caso di successo")
    private List<String> errors;

}
