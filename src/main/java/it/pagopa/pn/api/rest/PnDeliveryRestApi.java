package it.pagopa.pn.api.rest;

public interface PnDeliveryRestApi extends
        PnDeliveryRestApi_methodReceiveNotification,
        PnDeliveryRestApi_methodGetSentNotification,
        PnDeliveryRestApi_methodGetSentNotificationDocuments,
        PnDeliveryRestApi_methodGetSentNotificationLegalFacts,
        PnDeliveryRestApi_methodSearchSentNotification,

        PnDeliveryRestApi_methodGetReceivedNotification,
        PnDeliveryRestApi_methodGetReceivedNotificationDocuments,
        PnDeliveryRestApi_methodGetReceivedNotificationLegalFacts,
        PnDeliveryRestApi_methodSearchReceivedNotification
{ }
