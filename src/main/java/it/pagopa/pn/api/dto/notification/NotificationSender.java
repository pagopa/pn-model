package it.pagopa.pn.api.dto.notification;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class NotificationSender {

    @Schema( name = "paId", description = "Identificativo IPA della PA")
    private String paId;

    @Schema( name = "paDenomination", description = "Denominazione IPA della PA mittente")
    private String paDenomination;

}
