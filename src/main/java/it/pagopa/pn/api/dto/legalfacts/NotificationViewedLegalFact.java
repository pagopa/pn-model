package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


/**
 * https://docs.google.com/document/d/1wJ2TGGOoFDMlFqEf9VpraKC8yKn3Nrr24Z1kNeMBbPw
 * 4. Attestazione (lett. e)
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationViewedLegalFact {

    @Schema( name = "iun", description = "IUN della notifica di cui quest atto attesta l'affidamento a PN")
    private String iun;

    @Schema( name = "date", description = "Data di affidamento: perfezionamento per mittente")
    private Integer date;

    @Schema( name = "recipient", description = "Dati del destinatario")
    private RecipientInfo recipient;

}
