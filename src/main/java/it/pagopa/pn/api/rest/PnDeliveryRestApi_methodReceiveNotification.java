package it.pagopa.pn.api.rest;

import com.fasterxml.jackson.annotation.JsonView;
import it.pagopa.pn.api.dto.NewNotificationResponse;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface PnDeliveryRestApi_methodReceiveNotification {

    @PostMapping(PnDeliveryRestConstants.SEND_NOTIFICATIONS_PATH )
    NewNotificationResponse receiveNotification(
            @RequestHeader(name = PnDeliveryRestConstants.PA_ID_HEADER ) String paId,
            @RequestBody @JsonView(value = NotificationJsonViews.New.class ) Notification notification
    );

}
