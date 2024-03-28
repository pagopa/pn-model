package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.time.Instant;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PnAttachmentsConfigEventItem {

    private Instant startValidity;
    private Instant endValidity;
}
