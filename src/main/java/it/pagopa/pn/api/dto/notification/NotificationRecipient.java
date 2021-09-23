package it.pagopa.pn.api.dto.notification;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationRecipient {

    @Schema( description = "Codice Fiscale del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    @NotBlank(groups = { NotificationJsonViews.New.class })
    private String taxId;

    @Schema( description = "Nome e cognome / ragione sociale")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    @NotBlank(groups = { NotificationJsonViews.New.class })
    private String denomination;

    @Schema( description = "indirizzo digitale del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    @NotNull(groups = { NotificationJsonViews.New.class })
    @Valid
    private DigitalAddress digitalDomicile;

    @Schema( description = "indirizzo fisico del destinatario")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class})
    private PhysicalAddress physicalAddress;

}
