package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class SendDigitalFailureDetails implements TimelineElementDetails {

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "Codice Fiscale destinatario notifica digitale")
    private String taxId;

    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    @Schema( description = "indirizzi di invio della notifica e quando sono stati contattati")
    private List<FailedContact> addresses;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class FailedContact {

        @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        @Schema( description = "Indirizzo di invio della notifica")
        private DigitalAddress address;

        @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        @Schema( description = "Momento dell'invio")
        private Instant when;
    }
}
