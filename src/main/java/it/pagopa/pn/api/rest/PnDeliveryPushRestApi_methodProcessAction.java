package it.pagopa.pn.api.rest;

import org.springframework.web.bind.annotation.GetMapping;

public interface PnDeliveryPushRestApi_methodProcessAction {

    @GetMapping(PnDeliveryPushRestConstants.PROCESS_ACTION)
    void processAction();
}
