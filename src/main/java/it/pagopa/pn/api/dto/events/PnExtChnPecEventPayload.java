package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PnExtChnPecEventPayload {

    public static final String PN_EXTCHN_PEC_EVENT_CALLBACK_URL = "callbackUrl";
    public static final String PN_EXTCHN_PEC_EVENT_CODICE_ATTO = "codiceAtto";
    public static final String PN_EXTCHN_PEC_EVENT_NUMERO_CRONOLOGICO = "numeroCronologico";
    public static final String PN_EXTCHN_PEC_EVENT_PARTE_ISTANTE = "parteIstante";
    public static final String PN_EXTCHN_PEC_EVENT_PROCURATORE = "procuratore";
    public static final String PN_EXTCHN_PEC_EVENT_UFFICIALE_GIUDIZIARIO = "ufficialeGiudiziario";
    public static final String PN_EXTCHN_PEC_EVENT_IUN = "iun";
    public static final String PN_EXTCHN_PEC_EVENT_PA_MITTENTE = "paMittente";
    public static final String PN_EXTCHN_PEC_EVENT_PEC_MITTENTE = "pecMittente";
    public static final String PN_EXTCHN_PEC_EVENT_DESTINATARIO = "destinatario";
    public static final String PN_EXTCHN_PEC_EVENT_CODICE_FISCALE = "codiceFiscale";
    public static final String PN_EXTCHN_PEC_EVENT_PEC = "pec";

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_CALLBACK_URL)
    private String callbackUrl;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_CODICE_ATTO)
    private String codiceAtto;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_NUMERO_CRONOLOGICO)
    private String numeroCronologico;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_PARTE_ISTANTE)
    private String parteIstante;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_PROCURATORE)
    private String procuratore;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_UFFICIALE_GIUDIZIARIO)
    private String ufficialeGiudiziario;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_IUN)
    private String iun;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_PA_MITTENTE)
    private String paMittente;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_PEC_MITTENTE)
    private String pecMittente;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_DESTINATARIO)
    private String destinatario;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_CODICE_FISCALE)
    private String codiceFiscale;

    @JsonProperty(PnExtChnPecEventPayload.PN_EXTCHN_PEC_EVENT_PEC)
    private String pec;
}
