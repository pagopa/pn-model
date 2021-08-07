package it.pagopa.pn_doc.model.notification.timeline;


import it.pagopa.pn.model.notification.timeline.ITimelineElement;
import it.pagopa.pn.model.notification.timeline.TimelineElementDetails;
import it.pagopa.pn.model.notification.timeline.TimelineElementEventCategory;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class TimelineElement implements ITimelineElement {

    private Instant timestamp;
    private TimelineElementEventCategory eventCategory;
    private TimelineElementDetails details;

}

