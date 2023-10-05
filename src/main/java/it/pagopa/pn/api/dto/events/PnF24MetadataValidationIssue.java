package it.pagopa.pn.api.dto.events;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PnF24MetadataValidationIssue {
    private String code;
    private String element;
    private String detail;
}
