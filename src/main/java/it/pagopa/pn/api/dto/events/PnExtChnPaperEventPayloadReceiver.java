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
public class PnExtChnPaperEventPayloadReceiver {

    /**
     * The event property names
     */
    public static final String PN_EXTCHN_CART_EVENT_DESTINATARIO = "destinatario";
    public static final String PN_EXTCHN_CART_EVENT_CODICE_FISCALE = "codiceFiscale";
    public static final String PN_EXTCHN_CART_EVENT_PRESSO = "presso";
    public static final String PN_EXTCHN_CART_EVENT_INDIRIZZO = "indirizzo";
    public static final String PN_EXTCHN_CART_EVENT_SPECIFICA_INDIRIZZO = "specificaIndirizzo";
    public static final String PN_EXTCHN_CART_EVENT_CAP = "cap";
    public static final String PN_EXTCHN_CART_EVENT_COMUNE = "comune";
    public static final String PN_EXTCHN_CART_EVENT_PROVINCIA = "provincia";

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_DESTINATARIO)
    private String destinatario;

    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_CODICE_FISCALE)
    private String codiceFiscale;

    //

    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_PRESSO)
    private String presso;

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_INDIRIZZO)
    private String indirizzo;

    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_SPECIFICA_INDIRIZZO)
    private String specificaIndirizzo;

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_CAP)
    private String cap;

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_COMUNE)
    private String comune;

    @NotNull
    @NotEmpty
    @JsonProperty(PnExtChnPaperEventPayloadReceiver.PN_EXTCHN_CART_EVENT_PROVINCIA)
    private String provincia;

}
