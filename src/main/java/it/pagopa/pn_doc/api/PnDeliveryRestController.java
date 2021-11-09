package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.dto.NewNotificationResponse;
import it.pagopa.pn.api.dto.NotificationSearchRow;
import it.pagopa.pn.api.dto.legalfacts.LegalFactsListEntry;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.dto.notification.directaccesstoken.DirectAccessToken;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import it.pagopa.pn.api.dto.preload.PreloadRequest;
import it.pagopa.pn.api.dto.preload.PreloadResponse;
import it.pagopa.pn.api.rest.PnDeliveryRestApi;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

@RestController
public class PnDeliveryRestController implements PnDeliveryRestApi {

    @Override
    public NewNotificationResponse receiveNotification(String paId, Notification notification) {
        return null;
    }

    @Override
    public List<PreloadResponse> presignedUploadRequest(String paId, List<PreloadRequest> request) {
        return null;
    }

    @Override
    public Notification getSentNotification(String paId, String iun) {
        return null;
    }

	@Override
    public List<NotificationSearchRow> searchSentNotification(String senderId, Instant startDate, Instant endDate, String recipientId, NotificationStatus status, String subjectRegExp) {
        return null;
    }

	@Override
    public Notification getReceivedNotification(String userId, String iun) {
        return null;
    }

    @Override
    public List<LegalFactsListEntry> getReceivedNotificationLegalFacts(String userId, String iun) {
        return null;
    }

    @Override
    public ResponseEntity<Resource> getReceivedNotificationLegalFact(String userId, String iun, String legalFactId) {
        return null;
    }

    @Override
    public List<NotificationSearchRow> searchReceivedNotification(String recipientId, Instant startDate, Instant endDate, String senderId, NotificationStatus status, String subjectRegExp) {
        return null;
    }

    @Override
    public List<LegalFactsListEntry> getSentNotificationLegalFacts(String paId, String iun) {
        return null;
    }

    @Override
    public ResponseEntity<Resource> getSentNotificationLegalFact(String paId, String iun, String legalFactId) {
        return null;
    }

    @Override
    public ResponseEntity<Resource> getReceivedNotificationDocument(String userId, String iun, int documentIndex, ServerHttpResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<Resource> getSentNotificationDocument(String paId, String iun, int documentIndex, ServerHttpResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<DirectAccessToken> directAccessChallenge(String userSecret ,String token) {
        return null;
    }
}
