/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import javax.validation.constraints.NotEmpty;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author GIANGR40
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PnExtChnPaperEventPayload {

    @Schema( description = "Codice opaco utilizzato dal software client per correlare la risposta alla richiesta" )
    private String requestCorrelationId;

    @Schema( description = "Identificativo univoco della richiesta" )
    @NotEmpty
    private String iun;
    
    @Schema( description = "Indirizzo fisico destinatario" )
    @NotEmpty
    private PhysicalAddress destinationAddress;
    
    @Schema( description = "Tipologia comunicazione" )
    @NotEmpty
    private CommunicationType communicationType;
    
    @Schema( description = "Livello Servizio" )
    @NotEmpty
    private ServiceLevelType serviceLevel;
    
    @Schema( description = "Denominazione Mittente" )
    @NotEmpty
    private String senderDenomination;
    
    @Schema( description = "Denominazione Destinatario" )
    @NotEmpty
    private String recipientDenomination;
    
}

