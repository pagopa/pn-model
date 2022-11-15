package it.pagopa.pn.api.dto.events;


public interface GenericEvent<H extends GenericEventHeader, P> {

    H getHeader();

    P getPayload();
}
