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

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author GIANGR40
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PnExtChnPaperEventPayloadDocument {
    
    /**
     * The event property names
     */
    public static final String PN_EXTCHN_CART_EVENT_CODICE_ATTO = "codiceAtto";
    public static final String PN_EXTCHN_CART_EVENT_NUMERO_CRONOLOGICO = "numeroCronologico";
    public static final String PN_EXTCHN_CART_EVENT_PARTE_ISTANTE = "parteIstante";
    public static final String PN_EXTCHN_CART_EVENT_PROCURATORE = "procuratore";
    public static final String PN_EXTCHN_CART_EVENT_UFFICIALE_GIUDIZIARIO = "ufficialeGiudiziario";
    public static final String PN_EXTCHN_CART_EVENT_IUN = "iun";

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadDocument.PN_EXTCHN_CART_EVENT_CODICE_ATTO)
    private String codiceAtto;

    @JsonProperty(PnExtChnPaperEventPayloadDocument.PN_EXTCHN_CART_EVENT_NUMERO_CRONOLOGICO)
    private int numeroCronologico;

    @JsonProperty(PnExtChnPaperEventPayloadDocument.PN_EXTCHN_CART_EVENT_PARTE_ISTANTE)
    private String parteIstante;

    @JsonProperty(PnExtChnPaperEventPayloadDocument.PN_EXTCHN_CART_EVENT_PROCURATORE)
    private String procuratore;

    @JsonProperty(PnExtChnPaperEventPayloadDocument.PN_EXTCHN_CART_EVENT_UFFICIALE_GIUDIZIARIO)
    private String ufficialeGiudiziario;

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadDocument.PN_EXTCHN_CART_EVENT_IUN)
    private String iun;
    
}
