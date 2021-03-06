package it.pagopa.pn_doc.api;

import it.pagopa.pn.api.dto.legalfacts.LegalFactType;
import it.pagopa.pn.api.dto.legalfacts.LegalFactsListEntry;
import it.pagopa.pn.api.dto.notification.timeline.NotificationHistoryResponse;
import it.pagopa.pn.api.rest.PnDeliveryPushRestApi;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.util.List;

public class PnDeliveryPushRestController implements PnDeliveryPushRestApi {

    @Override
    public ResponseEntity<NotificationHistoryResponse> getTimelineAndStatusHistory(String iun, int numberOfRecipients, Instant createdAt) {return null;}

    @Override
    public List<LegalFactsListEntry> getLegalFacts(String iun) {
        return null;
    }

    @Override
    public ResponseEntity<Resource> getLegalFact(String iun, LegalFactType type, String legalFactId) {
        return null;
    }
}
