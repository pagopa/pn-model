package it.pagopa.pn.api.dto.extchannel;

import it.pagopa.pn.api.dto.notification.address.DigitalAddress;
import it.pagopa.pn.api.dto.notification.timeline.DownstreamId;
import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ExtChannelDigitalResponse extends ExtChannelResponse {
    private DigitalAddress address;
    private DownstreamId downstreamId;
    private List<String> attachmentKeys;

}
