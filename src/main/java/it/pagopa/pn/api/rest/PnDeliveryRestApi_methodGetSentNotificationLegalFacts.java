package it.pagopa.pn.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import it.pagopa.pn.api.dto.notification.Notification;

public interface PnDeliveryRestApi_methodGetSentNotificationLegalFacts {

	@GetMapping(PnDeliveryRestConstants.NOTIFICATION_SENT_LEGALFACTS_PATH)
    public Notification getSentNotificationLegalFacts( 
            @RequestHeader(name = PnDeliveryRestConstants.USER_ID_HEADER ) String userId,
            @PathVariable( name = "iun") String iun
    );

}
