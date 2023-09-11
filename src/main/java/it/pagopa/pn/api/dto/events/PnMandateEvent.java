package it.pagopa.pn.api.dto.events;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.time.Instant;
import java.util.Set;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PnMandateEvent implements GenericEvent<StandardEventHeader, PnMandateEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;

    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Payload {

        @NotEmpty
        private String mandateId;

        @NotEmpty
        private String delegateId;

        @NotEmpty
        private String delegatorId;

        private Set<String> visibilityIds;

        private Instant validFrom;

        private Instant validTo;

        private Set<String> groups;

        private Set<String> removedGroups;

        private Set<String> addedGroups;
    }

}
