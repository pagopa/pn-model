package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
@SuperBuilder
public class StandardEventHeader extends GenericEventHeader {

    public static final String PN_EVENT_HEADER_IUN = "iun";

    @Schema( name = PN_EVENT_HEADER_IUN, description = "Un messaggio è sempre collegato a una notifica")
    @NotEmpty
    private String iun;

}
