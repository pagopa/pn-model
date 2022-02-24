package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.dto.notification.timeline.TimelineElement;
import it.pagopa.pn.api.rest.PnDeliveryPushRestApi;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public class PnDeliveryPushRestController implements PnDeliveryPushRestApi {
    @Override
    public ResponseEntity<Set<TimelineElement>> getTimelineElements(String iun) {
        return null;
    }
}
