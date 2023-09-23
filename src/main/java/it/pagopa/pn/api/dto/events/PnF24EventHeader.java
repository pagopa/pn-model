package it.pagopa.pn.api.dto.events;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
@SuperBuilder
public class PnF24EventHeader extends GenericEventHeader {
    public static final String PN_EVENT_HEADER_CX_ID = "cxId";
    public static final String PN_EVENT_HEADER_SET_ID = "setId";
    private String cxId;
    private String setId;
}
