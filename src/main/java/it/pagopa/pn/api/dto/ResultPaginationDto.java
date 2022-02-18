package it.pagopa.pn.api.dto;

import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ResultPaginationDto<T> {
    private List<T> result;
    private boolean moreResult;
    private List<String> nextPagesKey;
}
