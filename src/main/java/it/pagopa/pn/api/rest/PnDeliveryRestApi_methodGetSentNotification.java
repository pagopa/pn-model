package it.pagopa.pn.api.rest;

import com.fasterxml.jackson.annotation.JsonView;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import org.springframework.web.bind.annotation.*;

public interface PnDeliveryRestApi_methodGetSentNotification {

	@GetMapping(PnDeliveryRestConstants.NOTIFICATION_SENT_PATH)
    @JsonView(value = NotificationJsonViews.Sent.class )
    Notification getSentNotification(
            @RequestHeader(name = PnDeliveryRestConstants.CX_ID_HEADER ) String paId,
            @PathVariable( name = "iun") String iun,
            @RequestParam( name = "with_timeline", defaultValue = "true", required = false ) boolean timeline
    );

}
