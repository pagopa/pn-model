/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotEmpty;

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
    
}
