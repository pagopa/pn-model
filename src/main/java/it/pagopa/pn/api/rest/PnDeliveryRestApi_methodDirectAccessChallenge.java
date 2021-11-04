package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.notification.directaccesstoken.DirectAccessToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


public interface PnDeliveryRestApi_methodDirectAccessChallenge {

    @GetMapping(PnDeliveryRestConstants.DIRECT_ACCESS_PATH)
    ResponseEntity<DirectAccessToken> directAccessChallenge(
            @RequestHeader(name = "user_secret") String userSecret,
            @RequestParam(name = "token") String token);
}
