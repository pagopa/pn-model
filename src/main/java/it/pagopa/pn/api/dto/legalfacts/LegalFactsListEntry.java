package it.pagopa.pn.api.dto.legalfacts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class LegalFactsListEntry {
    private String iun;
    private LegalFactsListEntryId legalFactsId;
    private String taxId;

}
