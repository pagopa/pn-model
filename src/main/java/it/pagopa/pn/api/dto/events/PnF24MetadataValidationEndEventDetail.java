package it.pagopa.pn.api.dto.events;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PnF24MetadataValidationEndEventDetail {
    private String setId;
    private String status;
    private List<PnF24MetadataValidationIssue> errors;
}
