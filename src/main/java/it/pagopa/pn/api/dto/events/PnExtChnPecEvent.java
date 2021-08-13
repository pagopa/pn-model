package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PnExtChnPecEvent implements GenericEvent<StandardEventHeader, PnExtChnPecEventPayload> {

    @JsonProperty( PN_EVENT_HEADER )
    private StandardEventHeader header;

    @JsonProperty( PN_EVENT_PAYLOAD )
    private PnExtChnPecEventPayload payload;

}
