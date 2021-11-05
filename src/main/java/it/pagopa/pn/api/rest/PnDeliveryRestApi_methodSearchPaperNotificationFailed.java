package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.notification.failednotification.PaperNotificationFailed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PnDeliveryRestApi_methodSearchPaperNotificationFailed {

    @GetMapping(PnDeliveryRestConstants.NOTIFICATIONS_PAPER_FAILED_PATH)
    ResponseEntity<List<PaperNotificationFailed>> searchPaperNotificationsFailed(
            @RequestParam(name = "recipientId") String recipientId);

}
