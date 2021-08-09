package it.pagopa.pn.api.dto.events;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
@Builder( toBuilder = true )
public class GenericEvent<H extends StandardEventHeader, P> {

    private H header;

    private P payload;
}
