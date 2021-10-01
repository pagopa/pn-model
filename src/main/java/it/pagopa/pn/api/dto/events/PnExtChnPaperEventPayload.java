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

    //TODO add fields...
    /*
     * i. 	Mittente -> Indirizzo Fisico
     * ii 	Tipologia Comunicazione
     * iii.	Livello Servizio
     * iv. 	Denominazione Mittente
     * 
     */
    
    @Schema( description = "Indirizzo fisico mittente" )
    @NotEmpty
    private PhysicalAddress senderAddress;
    
    @Schema( description = "Tipologia comunicazione" )
    @NotEmpty
    private String communicationType;		//TODO definire tipo
    
    @Schema( description = "Livello Servizio" )
    @NotEmpty
    private int serviceLevel;				//TODO definire tipo
    
    @Schema( description = "Denominazione Mittente" )
    @NotEmpty
    private String senderDenomination;		//TODO definire tipo
    
}

