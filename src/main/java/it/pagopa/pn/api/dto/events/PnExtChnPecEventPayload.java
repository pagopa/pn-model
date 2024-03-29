package it.pagopa.pn.api.dto.events;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPecEventPayload {

    //@Schema( description = "Codice opaco utilizzato dal software client per correlare la risposta alla richiesta" )
    private String requestCorrelationId;

    //@Schema( description = "Identificativo univoco della richiesta" )
    @NotEmpty
    private String iun;

    //@Schema( description = "Identificativo del mittente")
    @NotEmpty
    private String senderId;

    //@Schema( description = "Nome del mittente, solitamente la denominaziome della Pubblica Amministrazione")
    @NotEmpty
    private String senderDenomination;

    //@Schema( description = "Opzionale: Indirizzo pec del mittente da utilizzare nel campo Replay-To")
    private String senderPecAddress;

    //@Schema( description = "Denominazione del destinatario: nome e cognome o ragione sociale")
    @NotEmpty
    private String recipientDenomination;

    //@Schema( description = "Codice fiscale del destinatario")
    @NotEmpty
    private String recipientTaxId;

    //@Schema( description = "Indirizzo PEC del destinatario")
    @NotEmpty
    private String pecAddress;
    
    //@Schema( description = "Data di invio messaggio")
    @NotNull
    private Instant shipmentDate;

    //@Schema( description = "Link di accesso rapido" )
    @NotEmpty
    private String accessUrl;
}
