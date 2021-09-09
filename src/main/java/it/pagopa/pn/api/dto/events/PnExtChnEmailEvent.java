package it.pagopa.pn.api.dto.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnEmailEvent implements GenericEvent<StandardEventHeader, PnExtChnEmailEventPayload> {

    private StandardEventHeader header;

    private PnExtChnEmailEventPayload payload;

}
