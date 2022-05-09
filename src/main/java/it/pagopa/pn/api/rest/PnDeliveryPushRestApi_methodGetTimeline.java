package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.notification.timeline.NotificationHistoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.Instant;

public interface PnDeliveryPushRestApi_methodGetTimeline {

    @GetMapping(PnDeliveryPushRestConstants.TIMELINE_AND_STATUS_HISTORY_BY_IUN)
    ResponseEntity<NotificationHistoryResponse> getTimelineAndStatusHistory(
            @PathVariable( name = "iun") String iun,
            @PathVariable( name = "numberOfRecipients") int numberOfRecipients,
            @PathVariable( name = "createdAt") Instant createdAt
    );
}
