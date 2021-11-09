package it.pagopa.pn.api.dto.webhook;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WebhookConfigDto {
    private String paId;
    private String url;
    private Instant since;
    private boolean active;
}
