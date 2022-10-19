package it.pagopa.pn.api.dto.events;


public interface GenericFifoEvent<H extends StandardEventHeader, P> extends GenericEvent<H, P> {

    H getHeader();

    P getPayload();

    String getMessageGroupId();

    String getMessageDeduplicationId();
}
