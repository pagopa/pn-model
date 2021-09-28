package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.NotificationSearchRow;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.util.List;

public interface PnDeliveryRestApi_methodSearchReceivedNotification {
    @GetMapping(PnDeliveryRestConstants.NOTIFICATION_RECEIVED_PATH)
    List<NotificationSearchRow> searchReceivedNotification(
            @RequestParam(name = "recipientId") String recipientId,
            @RequestParam(name = "startDate") Instant startDate,
            @RequestParam(name = "endDate") Instant endDate,
            @RequestParam(name = "senderId", required = false) String senderId,
            @RequestParam(name = "status", required = false) NotificationStatus status,
            @RequestParam(name = "subjectRegExp", required = false) String subjectRegExp
    );
}
