package it.pagopa.pn.model.notification.timeline;


import java.util.List;

public interface ISendDigitalFeedbackDetails extends ISendDigitalDetails, TimelineElementDetails {

    List<String> getErrors();


}
