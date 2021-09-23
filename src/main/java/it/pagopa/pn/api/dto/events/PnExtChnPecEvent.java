package it.pagopa.pn.api.dto.events;

import lombok.*;

import javax.validation.Valid;

@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPecEvent implements GenericEvent<StandardEventHeader, PnExtChnPecEventPayload> {

    @Valid
    private StandardEventHeader header;

    @Valid
    private PnExtChnPecEventPayload payload;

}
