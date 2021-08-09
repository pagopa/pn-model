package it.pagopa.pn.api.dto.notification;


import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
public class NotificationRecipient {

    @Schema( name = "fc", description = "Codice Fiscale del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    private String fc;

    @Schema( name = "denomination", description = "Nome e cognome / ragione sociale")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    private String denomination;

    @Schema( name = "digitalDomicile", description = "indirizzo digitale del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    private DigitalAddress digitalDomicile;

    @Schema( name = "physicalAddress", description = "indirizzo fisico del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    private PhysicalAddress physicalAddress;

}
