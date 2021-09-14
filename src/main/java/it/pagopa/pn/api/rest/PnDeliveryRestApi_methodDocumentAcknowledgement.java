package it.pagopa.pn.api.rest;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface PnDeliveryRestApi_methodDocumentAcknowledgement {

    @PostMapping( PnDeliveryRestConstants.SENDER_DOCUMENTACKNOWLEDGEMENT_PATH )
    ResponseEntity<Resource> documentAcknowledgement(
    		@PathVariable("iun") String iun,
    		@PathVariable("documentIndex") int documentIndex
    );

}
