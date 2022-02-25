package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.legalfacts.LegalFactsListEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PnDeliveryPushRestApi_methodGetLegalFacts {

    @GetMapping(PnDeliveryPushRestConstants.LEGALFACTS_BY_IUN)
    List<LegalFactsListEntry> getLegalFacts(
            @PathVariable( name = "iun") String iun
    );
}
