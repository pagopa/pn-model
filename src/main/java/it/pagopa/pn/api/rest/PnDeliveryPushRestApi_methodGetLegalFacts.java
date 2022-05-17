package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.legalfacts.LegalFactType;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PnDeliveryPushRestApi_methodGetLegalFacts {

    @GetMapping(PnDeliveryPushRestConstants.LEGAL_FACT_BY_ID)
    ResponseEntity<Resource> getLegalFact(
        @PathVariable( name = "iun") String iun,
        @PathVariable( name = "type") LegalFactType type,
        @PathVariable( name = "id") String legalFactId
    );
}
