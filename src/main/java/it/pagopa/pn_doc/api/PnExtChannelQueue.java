package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.RestApiConstants;
import it.pagopa.pn_doc.model.notification.Notification;
import it.pagopa.pn_doc.model.notification.response.NotificationResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class PnDeliveryRest {

    @PostMapping(RestApiConstants.SENDER_NOTIFICATIONS_PATH )
    public NotificationResponse receiveNotification(
            @RequestHeader(name = RestApiConstants.PA_ID_HEADER ) String paId,
            @RequestBody Notification notification
    ) {
        return null;
    }
}
