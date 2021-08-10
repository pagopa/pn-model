package it.pagopa.pn.api.dto.events;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
public class GenericEvent<H extends StandardEventHeader, P> {

    private H header;

    private P payload;
}
