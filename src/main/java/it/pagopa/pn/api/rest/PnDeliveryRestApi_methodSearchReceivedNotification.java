package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.NotificationSearchRow;
import it.pagopa.pn.api.dto.ResultPaginationDto;
import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;

public interface PnDeliveryRestApi_methodSearchReceivedNotification {

    @GetMapping(PnDeliveryRestConstants.NOTIFICATIONS_RECEIVED_PATH)
    ResultPaginationDto<NotificationSearchRow,String> searchReceivedNotification(
            @RequestHeader(name = PnDeliveryRestConstants.CX_ID_HEADER) String currentRecipientId,
            @RequestParam(name = "startDate") Instant startDate,
            @RequestParam(name = "endDate") Instant endDate,
            @RequestParam(name = "delegatorRecipient", required = false) String delegatorRecipientId,
            @RequestParam(name = "senderId", required = false) String senderId,
            @RequestParam(name = "status", required = false) NotificationStatus status,
            @RequestParam(name = "subjectRegExp", required = false) String subjectRegExp,
            @RequestParam(name = "iunMatch", required = false) String iunMatch,
            @RequestParam(name = "size", required = false) Integer size,
            @RequestParam(name = "nextPagesKey", required = false) String nextPagesKey
    );
}
