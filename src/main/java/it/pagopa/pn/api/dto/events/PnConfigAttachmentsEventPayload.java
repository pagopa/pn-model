package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PnConfigAttachmentsEventPayload {

    private String configKey;
    private List<PnConfigAttachmentsEventItem> configs;
}
