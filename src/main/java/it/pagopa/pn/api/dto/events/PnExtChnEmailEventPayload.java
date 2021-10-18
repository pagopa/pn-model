package it.pagopa.pn.api.dto.events;

import java.time.Instant;

import javax.validation.constraints.NotEmpty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnEmailEventPayload {

	@Schema( description = "Identificativo univoco della richiesta" )
    @NotEmpty
    private String iun;

    @Schema( description = "Identificativo del mittente")
    @NotEmpty
    private String senderId;

    @Schema( description = "Nome del mittente, solitamente la denominaziome della Pubblica Amministrazione")
    @NotEmpty
    private String senderDenomination;

    @Schema( description = "Opzionale: Indirizzo email del mittente da utilizzare nel campo Replay-To")
    @NotEmpty
    private String senderEmailAddress;

    @Schema( description = "Denominazione del destinatario: nome e cognome o ragione sociale")
    @NotEmpty
    private String recipientDenomination;

    @Schema( description = "Codice fiscale del destinatario")
    @NotEmpty
    private String recipientTaxId;

    @Schema( description = "Indirizzo email del destinatario")
    @NotEmpty
    private String emailAddress;

    @Schema( description = "Data di invio")
    @NotNull
    private Instant shipmentDate;
}
