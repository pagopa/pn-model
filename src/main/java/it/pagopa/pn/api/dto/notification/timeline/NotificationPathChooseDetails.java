package it.pagopa.pn.api.dto.notification.timeline;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationPathChooseDetails implements TimelineElementDetails {

    @Schema( description = "Codice fiscale destinatario")
    String taxId;

    @Schema( description = "Specifica se la notifica al destinatario segue il percorso analogico o quello digitale")
    DeliveryMode deliveryMode;

    @Schema( description = "L'indirizzo di spedizione se si è scelta la modalità analogica")
    PhysicalAddress physicalAddress;

    @Schema( description = "L'indirizzo digitale di piattaforma")
    DigitalAddress platform;

    @Schema( description = "L'indirizzo digitale indicato dalla pa")
    DigitalAddress special;

    @Schema( description = "L'indirizzo digitale presente nei registri nazionali")
    DigitalAddress general;
    
    @Schema( description = "Elenco recapiti digitali del destinatario")
    List<DigitalAddress> courtesyAddresses;

}
