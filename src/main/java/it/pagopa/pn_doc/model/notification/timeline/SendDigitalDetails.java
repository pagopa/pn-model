package it.pagopa.pn_doc.model.notification.timeline;

import it.pagopa.pn_doc.model.notification.address.DigitalAddress;
import it.pagopa.pn.model.notification.timeline.ISendDigitalDetails;
import lombok.Builder;
import lombok.Getter;

@Getter // @Value implica classe final
@Builder
public class SendDigitalDetails implements ISendDigitalDetails {

    private String fc;
    private DigitalAddress address;
    private Integer retryNumber;
    private DownstreamId downstreamId;

}
