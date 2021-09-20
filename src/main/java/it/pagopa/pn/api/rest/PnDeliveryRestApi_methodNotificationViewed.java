package it.pagopa.pn.api.rest;

import javax.validation.constraints.NotBlank;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import it.pagopa.pn.api.dto.notification.Notification;

public interface PnDeliveryRestApi_methodNotificationViewed {

    @GetMapping( PnDeliveryRestConstants.NOTIFICATION_VIEWED_PATH )
    ResponseEntity<Resource> notificationViewed(
    		@PathVariable("iun") String iun,
    		@PathVariable("documentIndex") int documentIndex,
    		@RequestHeader(name = PnDeliveryRestConstants.USER_ID_HEADER, required = false ) String userId1,
    		@RequestParam(name = PnDeliveryRestConstants.USER_ID_HEADER, required = false ) String userId2
    );

    @GetMapping( PnDeliveryRestConstants.NOTIFICATION_RECEIVED_PATH )
	Notification receivedNotification(
			@NotBlank @PathVariable("iun") String iun,
    		@RequestHeader(name =  PnDeliveryRestConstants.USER_ID_HEADER, required = false) String userId1,
    		@RequestParam(name = PnDeliveryRestConstants.USER_ID_HEADER, required = false ) String userId2
	);

}
