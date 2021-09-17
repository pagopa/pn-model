package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.NotificationSearchRow;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.util.List;

public interface PnDeliveryRestApi_methodSearchSentNotification {
    @GetMapping(PnDeliveryRestConstants.SENDER_NOTIFICATIONS_PATH)
    List<NotificationSearchRow> searchSentNotification(
            @RequestParam(name = "senderId") String senderId,
            @RequestParam(name = "startDate") Instant startDate,
            @RequestParam(name = "endDate") Instant endDate,
            @RequestParam(name = "recipientId", required = false) String recipientId,
            @RequestParam(name = "status", required = false) NotificationStatus status,
            @RequestParam(name = "subjectRegExp", required = false) String subjectRegExp
    );
}
