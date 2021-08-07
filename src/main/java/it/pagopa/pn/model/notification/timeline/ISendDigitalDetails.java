package it.pagopa.pn.model.notification.timeline;


import it.pagopa.pn.model.notification.address.IDigitalAddress;

public interface ISendDigitalDetails extends TimelineElementDetails {

    String getFc();
    IDigitalAddress getAddress();
    Integer getRetryNumber();
    IDownstreamId getDownstreamId();

}
