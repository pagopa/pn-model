package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
 * https://docs.google.com/document/d/1wJ2TGGOoFDMlFqEf9VpraKC8yKn3Nrr24Z1kNeMBbPw
 * 1. Attestazione (lett. a, b)
 */
@Value
@Builder( toBuilder = true )
public class NotificationReceivedLegalFact {

    @Schema( name = "iun", description = "IUN della notifica di cui quest atto attesta l'affidamento a PN")
    private String iun;

    @Schema( name = "date", description = "Data di affidamento: perfezionamento per mittente")
    private Integer date;

    @Schema( name = "digests", description = "elenco dei codici di identificazione degli allegati digitali")
    private List<String> digests;

    @Schema( name = "sender", description = "Dati del mittente")
    private SenderInfo sender;

    @Schema( name = "recipient", description = "Dati del destinatario")
    private RecipientInfoWithAddresses recipient;


}
