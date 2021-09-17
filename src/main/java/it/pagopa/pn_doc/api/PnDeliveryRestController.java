package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.dto.NotificationSearchRow;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import it.pagopa.pn.api.dto.NewNotificationResponse;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.rest.PnDeliveryRestApi;

import java.time.Instant;
import java.util.List;

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
	public ResponseEntity<Resource> notificationViewed(String iun, int documentIndex, String userId1, String userId2) {
		return null;
	}

    @Override
    public List<NotificationSearchRow> getSentNotification(String senderId, Instant startDate, Instant endDate, String recipientId, NotificationStatus status, String subjectRegExp) {
        return null;
    }
}
