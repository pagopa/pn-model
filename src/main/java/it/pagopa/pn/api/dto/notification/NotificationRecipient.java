package it.pagopa.pn.api.dto.notification;


import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationRecipient {

    @Schema( name = "fc", description = "Codice Fiscale del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    @NotBlank(groups = { NotificationJsonViews.New.class })
    private String fc;

    @Schema( name = "denomination", description = "Nome e cognome / ragione sociale")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    @NotBlank(groups = { NotificationJsonViews.New.class })
    private String denomination;

    @Schema( name = "digitalDomicile", description = "indirizzo digitale del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    @NotNull(groups = { NotificationJsonViews.New.class })
    @Valid
    private DigitalAddress digitalDomicile;

    @Schema( name = "physicalAddress", description = "indirizzo fisico del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    private PhysicalAddress physicalAddress;

}
