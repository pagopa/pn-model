package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.rest.PnDeliveryRestApi;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.dto.NewNotificationResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PnDeliveryRestController implements PnDeliveryRestApi {


    @Override
    public NewNotificationResponse receiveNotification(String paId, Notification notification) {
        return null;
    }

    @Override
    public Notification getSentNotification(String paId, String iun) {
        return null;
    }
}
