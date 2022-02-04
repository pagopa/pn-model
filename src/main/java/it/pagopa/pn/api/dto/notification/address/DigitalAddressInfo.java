package it.pagopa.pn.api.dto.notification.address;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class DigitalAddressInfo {
    private DigitalAddress address;
    private DigitalAddressSource addressSource;
    private int sentAttemptMade;
    private Instant lastAttemptDate;
}
