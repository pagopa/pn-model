/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import javax.validation.constraints.NotEmpty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PnExtChnPaperEventPayloadNotice {

	 @Schema( description = "Identificativo univoco della richiesta" )
	 @NotEmpty
	 private String iun;
	 
	 @Schema( description = "Indicazione della modalità di accesso ed acquisizione dell’oggetto della notifica" )
	 @NotEmpty
	 private String notificationAquisitionMode;
	 
	 @Schema( description = "indicazione della modalità di accesso ed acquisizione della copia cartacea dell’oggetto della notifica" )
	 @NotEmpty
	 private String paperAquisitionMode;
    
}
