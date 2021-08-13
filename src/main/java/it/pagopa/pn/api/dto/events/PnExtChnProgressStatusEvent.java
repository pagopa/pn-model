package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder( toBuilder = true )
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PnExtChnProgressStatusEvent implements GenericEvent<StandardEventHeader, PnExtChnProgressStatusEventPayload> {

    @JsonProperty( PN_EVENT_HEADER )
    private StandardEventHeader header;

    @JsonProperty( PN_EVENT_PAYLOAD )
    private PnExtChnProgressStatusEventPayload payload;

}
