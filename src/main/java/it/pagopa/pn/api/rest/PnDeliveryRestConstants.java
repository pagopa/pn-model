package it.pagopa.pn.api.rest;

public class PnDeliveryRestConstants {

    private PnDeliveryRestConstants() {}

    public static final String PA_ID_HEADER = "X-PagoPA-PN-PA";
    public static final String USER_ID_HEADER = "X-PagoPA-User-Id";


    private static final String DELIVERY_PATH = "delivery";

    public static final String SEND_NOTIFICATIONS_PATH = DELIVERY_PATH + "/notifications/sent";

    public static final String NOTIFICATION_SENT_PATH = DELIVERY_PATH + "/notifications/sent/{iun}";
    public static final String NOTIFICATION_SENT_DOCUMENTS_PATH = DELIVERY_PATH + "/notifications/sent/{iun}/documents/{documentIndex}";
    public static final String NOTIFICATION_SENT_LEGALFACTS_PATH = DELIVERY_PATH + "/notifications/sent/{iun}/legalfacts/";


    public static final String NOTIFICATIONS_RECEIVED_PATH = DELIVERY_PATH + "/notifications/received";
    public static final String NOTIFICATION_RECEIVED_PATH = DELIVERY_PATH + "/notifications/received/{iun}";
    public static final String NOTIFICATION_RECEIVED_LEGALFACTS_PATH = DELIVERY_PATH + "/notifications/received/{iun}/legalfacts/";
    public static final String NOTIFICATION_VIEWED_PATH = DELIVERY_PATH + "/notifications/received/{iun}/documents/{documentIndex}";

}
