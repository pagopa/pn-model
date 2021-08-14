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
public class DigitalAddress {

    @Schema( name = "type", description = "tipo di indirizzo PEC, REM, SERCQ, ..." )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private DigitalAddressType type;

    @Schema( name = "address", description = "account@domain" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private String address;

}
