package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPecEventPayload {

    @Schema( description = "Codice opaco utilizzato dal software client per correlare la risposta alla richiesta" )
    private String requestCorrelationId;

    @Schema( description = "Identificativo univoco della richiesta" )
    private String iun;

    @Schema( description = "Identificativo del mittente")
    private String senderId;

    @Schema( description = "Nome del mittente, solitamente la denominaziome della Pubblica Amministrazione")
    private String senderDenomination;

    @Schema( description = "Opzionale: Indirizzo pec del mittente da utilizzare nel campo Replay-To")
    private String senderPecAddress;

    @Schema( description = "Denominazione del destinatario: nome e cognome o ragione sociale")
    private String recipientDenomination;

    @Schema( description = "Codice fiscale del destinatario")
    private String recipientTaxId;

    @Schema( description = "Indirizzo PEC del destinatario")
    private String pecAddress;


    // FIXME: tradurre in inglese
    private String codiceAtto;
    private String numeroCronologico;
    private String parteIstante;
    private String procuratore;
    private String ufficialeGiudiziario;

}
