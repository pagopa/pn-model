package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * https://docs.google.com/document/d/1wJ2TGGOoFDMlFqEf9VpraKC8yKn3Nrr24Z1kNeMBbPw
 * 3. Attestazione (lett. d)
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class DigitalProcessFallbackLegalFact {

    @Schema( description = "IUN della notifica di cui quest atto attesta l'affidamento a PN")
    private String iun;

    @Schema( description = "Data in cui il sistema di messaggistica conferma il recapito o l'impossibilità di recapitare il messaggio")
    private String date;

    @Schema( description = "Dati del destinatario")
    private RecipientInfo recipient;

    @Schema( description = "Rappresentazione in stringa dell'indirizzo digitale")
    private String digitalAddress;

    @Schema( description = "Rappresentazione in stringa dell'indirizzo fisico")
    private String physicalAddress;

}
