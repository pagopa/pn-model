package it.pagopa.pn.api.dto.notification.address;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class DigitalAddress {

    @Schema( description = "tipo di indirizzo PEC, REM, SERCQ, ..." )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @NotNull(groups = { NotificationJsonViews.New.class })
    private DigitalAddressType type;

    @Schema( description = "account@domain" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @NotBlank(groups = { NotificationJsonViews.New.class })
    @Email(groups = { NotificationJsonViews.New.class })
    private String address;

}
