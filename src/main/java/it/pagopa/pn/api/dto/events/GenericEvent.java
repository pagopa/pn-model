package it.pagopa.pn.api.dto.events;

public interface GenericEvent<H extends StandardEventHeader, P> {

    H getHeader();

    P getPayload();
}
