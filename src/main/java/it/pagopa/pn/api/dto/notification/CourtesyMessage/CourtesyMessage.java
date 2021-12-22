package it.pagopa.pn.api.dto.notification.CourtesyMessage;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class CourtesyMessage {
    private String address;
    private String iun;
    private String taxId;
    private Instant insertDate;
}
