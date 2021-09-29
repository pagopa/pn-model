package it.pagopa.pn.api.dto.preload;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PreloadRequest {
    private String key;
}
