package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PnAttachmentsConfigEventPayload {

    private String configKey;
    private String configType;
    private List<PnAttachmentsConfigEventItem> configs;
}
