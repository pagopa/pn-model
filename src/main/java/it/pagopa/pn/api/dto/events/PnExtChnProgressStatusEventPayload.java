package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnProgressStatusEventPayload {

    @Schema( description = "Codice opaco utilizzato dal software client per correlare la risposta alla richiesta" )
    private String requestCorrelationId;

    @Schema( description = "Identificativo univoco della richiesta" )
    private String iun;

    @Schema( description = "Tipo di errore o assenza di errore" )
    private PnExtChnProgressStatus statusCode;

    @Schema( description = "Data di definizione dello stato" )
    private Instant statusDate;

    @Schema( description = "Dettagli sullo specifico stato" )
    private List<String> statusDetails;

    @Schema( description = "Eventuale nuovo indirizzo del destinatario" )
    private String newAddress;

    private String tipoInvio;
    private String codiceAtto;
    private String codiceRaccomandata;

    private String iDPec;

    private String ricevutaEMLInvio;

    private String ricevutaEMLConsegna;


    private Integer tentativo;

    private String canale;
}
