package it.pagopa.pn.api.dto.preload;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PreloadResponse {
    private String secret;
    private String httpMethod;
    private String url;
    private String key;
}
