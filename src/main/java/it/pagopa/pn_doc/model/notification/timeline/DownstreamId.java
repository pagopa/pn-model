package it.pagopa.pn_doc.model.notification.timeline;

import it.pagopa.pn.model.notification.timeline.IDownstreamId;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DownstreamId implements IDownstreamId {

    private String systemId;
    private String messageId;

}
