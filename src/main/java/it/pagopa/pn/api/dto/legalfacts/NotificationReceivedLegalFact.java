package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

/**
 * https://docs.google.com/document/d/1wJ2TGGOoFDMlFqEf9VpraKC8yKn3Nrr24Z1kNeMBbPw
 * 1. Attestazione (lett. a, b)
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationReceivedLegalFact {

    @Schema( description = "IUN della notifica di cui quest atto attesta l'affidamento a PN")
    private String iun;

    @Schema( description = "Data di affidamento: perfezionamento per mittente")
    private String date;

    @Schema( description = "elenco dei codici di identificazione degli allegati digitali")
    private List<String> digests;

    @Schema( description = "Dati del mittente")
    private SenderInfo sender;

    @Schema( description = "Dati del destinatario")
    private RecipientInfoWithAddresses recipient;


}
