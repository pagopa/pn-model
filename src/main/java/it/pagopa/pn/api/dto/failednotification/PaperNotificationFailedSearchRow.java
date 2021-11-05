package it.pagopa.pn.api.dto.failednotification;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PaperNotificationFailedSearchRow {
    private String iun;
    private String recipientId;
}
