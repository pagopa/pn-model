/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    /**
     * The event property names
     */
    public static final String PN_EXTCHN_CART_EVENT_CALLBACK_URL = "callbackUrl";
    public static final String PN_EXTCHN_CART_EVENT_DOCUMENTO = "documento";
    public static final String PN_EXTCHN_CART_EVENT_MITTENTE = "mittente";
    public static final String PN_EXTCHN_CART_EVENT_DESTINATARIO = "destinatario";
    public static final String PN_EXTCHN_CART_EVENT_AVVISO_RICEZIONE = "avvisoRicezione";

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayload.PN_EXTCHN_CART_EVENT_CALLBACK_URL)
    private String urlCallBack;

    @Valid
    @JsonProperty(PnExtChnPaperEventPayload.PN_EXTCHN_CART_EVENT_DOCUMENTO)
    private PnExtChnPaperEventPayloadDocument documento;

    @NotNull
    @Valid
    @JsonProperty(PnExtChnPaperEventPayload.PN_EXTCHN_CART_EVENT_MITTENTE)
    private PnExtChnPaperEventPayloadSender mittente;

    @NotNull
    @Valid
    @JsonProperty(PnExtChnPaperEventPayload.PN_EXTCHN_CART_EVENT_DESTINATARIO)
    private PnExtChnPaperEventPayloadReceiver destinatario;
    
    @NotNull
    @Valid
    @JsonProperty(PnExtChnPaperEventPayload.PN_EXTCHN_CART_EVENT_AVVISO_RICEZIONE)
    private PnExtChnPaperEventPayloadNotice avvisoRicezione;
    
}

