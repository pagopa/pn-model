package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPecEvent implements GenericEvent<StandardEventHeader, PnExtChnPecEventPayload> {

    private StandardEventHeader header;

    private PnExtChnPecEventPayload payload;

}
