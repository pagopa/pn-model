package it.pagopa.pn_doc.api;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import it.pagopa.pn.api.dto.NewNotificationResponse;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.rest.PnDeliveryRestApi;

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

	@Override
	public ResponseEntity<Resource> documentAcknowledgement(String iun, int documentIndex) {
		return null;
	}

}
