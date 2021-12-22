package it.pagopa.pn.api.dto.publicregistry;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class PublicRegistryResponse {
    private String correlationId;
    private String digitalAddress;
    private PhysicalAddressDTO physicalAddress;
}
