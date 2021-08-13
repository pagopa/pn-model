package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface GenericEvent<H extends StandardEventHeader, P> {

    public static final String PN_EVENT_HEADER = "header";
    public static final String PN_EVENT_PAYLOAD = "payload";

    @JsonProperty( PN_EVENT_HEADER )
    H getHeader();

    @JsonProperty( PN_EVENT_PAYLOAD )
    P getPayload();
}
