package it.pagopa.pn.api.rest;

import com.fasterxml.jackson.annotation.JsonView;
import it.pagopa.pn.api.dto.NewNotificationResponse;
import it.pagopa.pn.api.dto.notification.Notification;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import it.pagopa.pn.api.dto.preload.PreloadRequest;
import it.pagopa.pn.api.dto.preload.PreloadResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface PnDeliveryRestApi_methodReceiveNotification {

    @PostMapping(PnDeliveryRestConstants.SEND_NOTIFICATIONS_PATH )
    NewNotificationResponse receiveNotification(
            @RequestHeader(name = PnDeliveryRestConstants.PA_ID_HEADER ) String paId,
            @RequestBody @JsonView(value = NotificationJsonViews.New.class ) Notification notification
    );

    @PostMapping( PnDeliveryRestConstants.ATTACHMENT_PRELOAD_REQUEST)
    List<PreloadResponse> presignedUploadRequest(
            @RequestHeader(name = PnDeliveryRestConstants.PA_ID_HEADER ) String paId,
            @RequestBody List<PreloadRequest> request
    );


}
