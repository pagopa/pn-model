package it.pagopa.pn_doc.api;

import com.fasterxml.jackson.annotation.JsonView;
import it.pagopa.pn.api.RestApiConstants;
import it.pagopa.pn_doc.model.notification.Notification;
import it.pagopa.pn_doc.model.notification.NotificationJsonViews;
import it.pagopa.pn_doc.model.notification.response.NotificationResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class PnDeliveryRest {

    @PostMapping(RestApiConstants.SENDER_NOTIFICATIONS_PATH )
    public NotificationResponse receiveNotification(
            @RequestHeader(name = RestApiConstants.PA_ID_HEADER ) String paId,
            @RequestBody @JsonView(value = NotificationJsonViews.New.class ) Notification notification
    ) {
        return null;
    }
}
