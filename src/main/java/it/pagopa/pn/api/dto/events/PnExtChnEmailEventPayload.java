package it.pagopa.pn.api.dto.events;

import java.time.Instant;

import javax.validation.constraints.NotEmpty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnEmailEventPayload {

	@Schema( description = "Identificativo univoco della richiesta" )
    private String iun;

    @Schema( description = "Identificativo del mittente")
    private String senderId;

    @Schema( description = "Nome del mittente, solitamente la denominaziome della Pubblica Amministrazione")
    private String senderDenomination;

    @Schema( description = "Opzionale: Indirizzo email del mittente da utilizzare nel campo Replay-To")
    private String senderEmailAddress;

    @Schema( description = "Denominazione del destinatario: nome e cognome o ragione sociale")
    private String recipientDenomination;

    @Schema( description = "Codice fiscale del destinatario")
    private String recipientTaxId;

    @Schema( description = "Indirizzo email del destinatario")
    private String emailAddress;
    
    @Schema( description = "Data di invio")
    private Instant shipmentDate;
}
