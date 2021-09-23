package it.pagopa.pn.api.dto.notification.timeline;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
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

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codice fiscale destinatario")
    String taxId;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Specifica se la notifica al destinatario segue il percorso analogico o quello digitale")
    DeliveryMode deliveryMode;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "L'indirizzo di spedizione se si è scelta la modalità analogica")
    PhysicalAddress physicalAddress;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "L'indirizzo digitale di piattaforma")
    DigitalAddress platform;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "L'indirizzo digitale indicato dalla pa")
    DigitalAddress special;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "L'indirizzo digitale presente nei registri nazionali")
    DigitalAddress general;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Elenco recapiti digitali del destinatario")
    List<DigitalAddress> courtesyAddresses;

}
