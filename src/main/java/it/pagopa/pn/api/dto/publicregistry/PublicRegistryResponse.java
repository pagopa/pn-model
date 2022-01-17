package it.pagopa.pn.api.dto.publicregistry;

import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.address.PhysicalAddress;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class PublicRegistryResponse {
    private String correlationId;
    private DigitalAddress digitalAddress;
    private PhysicalAddress physicalAddress;
}
