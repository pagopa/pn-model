package it.pagopa.pn.api.rest;

public class PnDeliveryRestConstants {

    private PnDeliveryRestConstants() {}

    private static final String DELIVERY_PATH = "delivery";

    public static final String SENDER_NOTIFICATIONS_PATH = DELIVERY_PATH + "/notifications/sent";
    public static final String PA_ID_HEADER = "X-PagoPA-PN-PA";
}
