package it.pagopa.pn.model.notification.timeline;


import java.time.Instant;

public interface ITimelineElement {

    Instant getTimestamp();
    TimelineElementEventCategory getEventCategory();
    TimelineElementDetails getDetails();

}

