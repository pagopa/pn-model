package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder( toBuilder = true )
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnProgressStatusEvent implements GenericEvent<StandardEventHeader, PnExtChnProgressStatusEventPayload> {

    private StandardEventHeader header;

    private PnExtChnProgressStatusEventPayload payload;

}
