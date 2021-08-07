package it.pagopa.pn.api.dto.notification;


import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class NotificationRecipient {

    @Schema( name = "fc", description = "Codice Fiscale del destinatario")
    private String fc;

    @Schema( name = "denomination", description = "Nome e cognome / ragione sociale")
    private String denomination;

    @Schema( name = "digitalDomicile", description = "indirizzo digitale del destinatario")
    private DigitalAddress digitalDomicile;

    @Schema( name = "physicalAddress", description = "indirizzo fisico del destinatario")
    private PhysicalAddress physicalAddress;

}
