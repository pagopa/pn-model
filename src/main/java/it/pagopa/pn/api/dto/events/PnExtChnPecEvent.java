package it.pagopa.pn.api.dto.events;

import lombok.*;

import jakarta.validation.Valid;

@Builder(toBuilder = true)
@Getter
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
