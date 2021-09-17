package it.pagopa.pn.api.rest;

public class PnDeliveryRestConstants {

    private PnDeliveryRestConstants() {}

    private static final String DELIVERY_PATH = "delivery";

    public static final String SENDER_NOTIFICATIONS_PATH = DELIVERY_PATH + "/notifications/sent";
    public static final String NOTIFICATION_VIEWED_PATH = DELIVERY_PATH + "/notifications/viewed";
    public static final String PA_ID_HEADER = "X-PagoPA-PN-PA"; 
    public static final String USER_ID_HEADER = "X-PagoPA-User-Id";
}
