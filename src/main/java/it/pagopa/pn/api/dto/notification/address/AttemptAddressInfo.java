package it.pagopa.pn.api.dto.notification.address;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class AttemptAddressInfo {
    private DigitalAddressSource2 addressSource;
    private int attemptNumberMade;
    private Instant lastAttemptDate;
}
