package it.pagopa.pn.api.rest;

public class PnDeliveryPushRestConstants {


    private PnDeliveryPushRestConstants() {}

    private static final String DELIVERY_PUSH_PATH = "delivery-push";

    public static final String TIMELINE_BY_IUN = DELIVERY_PUSH_PATH + "/timelines/{iun}";

    public static final String TIMELINE_AND_STATUS_HISTORY_BY_IUN = DELIVERY_PUSH_PATH + "/timeline-and-history/{iun}";

    public static final String LEGAL_FACTS_BY_IUN = DELIVERY_PUSH_PATH + "/legalfacts/{iun}";

    public static final String LEGAL_FACT_BY_ID = DELIVERY_PUSH_PATH + "/legalfacts/{iun}/{type}/{id}";

    public static final String NOTIFICATIONS_PAPER_FAILED_PATH = DELIVERY_PUSH_PATH + "/notifications/paper-failed";

}
