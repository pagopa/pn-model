package it.pagopa.pn.api.dto.events;

import lombok.*;

import javax.validation.Valid;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnEmailEvent implements GenericEvent<StandardEventHeader, PnExtChnEmailEventPayload> {

    @Valid
    private StandardEventHeader header;

    @Valid
    private PnExtChnEmailEventPayload payload;

}
