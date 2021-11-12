package it.pagopa.pn.api.dto.webhook;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WebhookConfigDto {
    private String paId;
    private String url;
    private Instant startFrom;
    private boolean active;
    private WebhookType type;
    private boolean allNotifications;
    private Set<String> notificationsElement;
}
