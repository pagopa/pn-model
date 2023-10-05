package it.pagopa.pn.api.dto.events;

import lombok.*;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PnF24MetadataValidationEndEventPayload {
    private String setId;
    private String status;
    private List<PnF24MetadataValidationIssue> errors;
}
