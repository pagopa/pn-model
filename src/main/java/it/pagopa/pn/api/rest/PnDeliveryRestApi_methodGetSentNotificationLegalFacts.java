package it.pagopa.pn.api.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import it.pagopa.pn.api.dto.LegalFactsRow;

public interface PnDeliveryRestApi_methodGetSentNotificationLegalFacts {

	@GetMapping(PnDeliveryRestConstants.NOTIFICATION_SENT_LEGALFACTS_PATH)
    public List<LegalFactsRow> getSentNotificationLegalFacts( 
            @RequestHeader(name = PnDeliveryRestConstants.PA_ID_HEADER ) String paId,
            @PathVariable( name = "iun") String iun
    );

}
