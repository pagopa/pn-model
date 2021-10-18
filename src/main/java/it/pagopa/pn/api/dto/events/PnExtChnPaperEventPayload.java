/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

/**
 *
 * @author GIANGR40
 */
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPaperEventPayload {

    @Schema( description = "Codice opaco utilizzato dal software client per correlare la risposta alla richiesta" )
    private String requestCorrelationId;

    @Schema( description = "Identificativo univoco della richiesta" )
    @NotEmpty
    private String iun;
    
    @Schema( description = "Indirizzo fisico destinatario" )
    @NotNull
    private PhysicalAddress destinationAddress;
    
    @Schema( description = "Tipologia comunicazione" )
    @NotNull
    private CommunicationType communicationType;
    
    @Schema( description = "Livello Servizio" )
    @NotNull
    private ServiceLevelType serviceLevel;
    
    @Schema( description = "Denominazione Mittente" )
    @NotEmpty
    private String senderDenomination;
    
    @Schema( description = "Denominazione Destinatario" )
    @NotEmpty
    private String recipientDenomination;
    
}

