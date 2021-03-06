package it.pagopa.pn.api.rest;

public interface PnDeliveryRestApi extends
        PnDeliveryRestApi_methodReceiveNotification,

        PnDeliveryRestApi_methodGetSentNotification,
        PnDeliveryRestApi_methodGetSentNotificationDocuments,
        PnDeliveryRestApi_methodSearchSentNotification,

        PnDeliveryRestApi_methodGetReceivedNotification,
        PnDeliveryRestApi_methodGetReceivedNotificationDocuments,
        PnDeliveryRestApi_methodSearchReceivedNotification,

        PnDeliveryRestApi_methodDirectAccessChallenge
{ }
