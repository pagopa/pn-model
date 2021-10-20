package it.pagopa.pn.api.rest;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

public interface PnDeliveryRestApi_methodGetReceivedNotificationDocuments {

    @GetMapping( PnDeliveryRestConstants.NOTIFICATION_VIEWED_PATH )
    ResponseEntity<Resource> getReceivedNotificationDocument(
            @RequestHeader(name = PnDeliveryRestConstants.USER_ID_HEADER) String userId,
    		@PathVariable("iun") String iun,
    		@PathVariable("documentIndex") int documentIndex,
            ServerHttpResponse response
    );

}
