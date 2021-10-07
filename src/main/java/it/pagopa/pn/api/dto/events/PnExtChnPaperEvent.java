/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

/**
 *
 * @author GIANGR40
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PnExtChnPaperEvent implements GenericEvent<StandardEventHeader, PnExtChnPaperEventPayload> {

    @JsonProperty("header")
    @Valid
    private StandardEventHeader header;

    @JsonProperty("payload")
    @Valid
    private PnExtChnPaperEventPayload payload;

}
