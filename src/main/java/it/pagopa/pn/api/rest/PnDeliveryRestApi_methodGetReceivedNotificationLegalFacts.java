package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.legalfacts.LegalFactType;
import it.pagopa.pn.api.dto.legalfacts.LegalFactsListEntry;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface PnDeliveryRestApi_methodGetReceivedNotificationLegalFacts {

	@GetMapping(PnDeliveryRestConstants.NOTIFICATION_RECEIVED_LEGALFACTS_PATH)
    List<LegalFactsListEntry> getReceivedNotificationLegalFacts(
            @RequestHeader(name = PnDeliveryRestConstants.CX_ID_HEADER ) String userId,
            @PathVariable( name = "iun") String iun
    );

    @GetMapping(PnDeliveryRestConstants.NOTIFICATION_RECEIVED_LEGALFACTS_PATH + "/{type}/{id}")
    ResponseEntity<Resource> getReceivedNotificationLegalFact(
            @RequestHeader(name = PnDeliveryRestConstants.CX_ID_HEADER ) String userId,
            @PathVariable( name = "iun") String iun,
            @PathVariable( name = "type") LegalFactType type,
            @PathVariable( name = "id") String legalFactId
    );

}
