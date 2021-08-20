package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPecEvent implements GenericEvent<StandardEventHeader, PnExtChnPecEventPayload> {

    @JsonProperty( PN_EVENT_HEADER )
    private StandardEventHeader header;

    @JsonProperty( PN_EVENT_PAYLOAD )
    private PnExtChnPecEventPayload payload;

}
