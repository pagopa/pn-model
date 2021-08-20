package it.pagopa.pn.api.dto.notification.address;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PhysicalAddress {

    @Schema( name = "at", description = "Campo \"presso\" dell'indirizzo")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String at;

    @Schema( name = "address", description = "Indirizzo del domicilio fisico")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String address;

    @Schema( name = "addressDetails", description = "Seconda riga dell'indirizzo fisico")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String addressDetails;

    @Schema( name = "zip", description = "Codice di avviamento postale")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String zip;

    @Schema( name = "municipality", description = "Comune in cui l'indirizzo si trova")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String municipality;

    @Schema( name = "province", description = "Provincia in cui si trova l'indirizzo")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String province;


}
