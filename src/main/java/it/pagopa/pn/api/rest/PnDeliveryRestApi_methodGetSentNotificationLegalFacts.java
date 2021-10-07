package it.pagopa.pn.api.rest;

import java.util.List;

import it.pagopa.pn.api.dto.legalfacts.LegalFactsListEntry;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


public interface PnDeliveryRestApi_methodGetSentNotificationLegalFacts {

	@GetMapping(PnDeliveryRestConstants.NOTIFICATION_SENT_LEGALFACTS_PATH)
    List<LegalFactsListEntry> getSentNotificationLegalFacts(
            @RequestHeader(name = PnDeliveryRestConstants.PA_ID_HEADER ) String paId,
            @PathVariable( name = "iun") String iun
    );

    @GetMapping(PnDeliveryRestConstants.NOTIFICATION_RECEIVED_LEGALFACTS_PATH + "/{id}")
    ResponseEntity<Resource> getSentNotificationLegalFact(
            @RequestHeader(name = PnDeliveryRestConstants.PA_ID_HEADER ) String paId,
            @PathVariable( name = "iun") String iun,
            @PathVariable( name = "id") String legalFactId
    );

}
