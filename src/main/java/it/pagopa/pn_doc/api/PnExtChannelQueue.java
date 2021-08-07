package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.RestApiConstants;
import it.pagopa.pn_doc.model.notification.Notification;
import it.pagopa.pn_doc.model.notification.response.NotificationResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class PnExtChannelQueue {

    @PostMapping("coda_ingresso_extch" )
    public void receiveNotification(
            @RequestBody Notification notification
    ) {
        //
    }

    @GetMapping("coda_ingresso_extch" )
    public Notification receiveNotification( ) {
        return null;
    }
}
