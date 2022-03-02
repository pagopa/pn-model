package it.pagopa.pn.api.dto.legalfacts;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class LegalFactsListEntryId {

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Chiave dell'atto opponibile a terzi generato durante il processo di consegna")
    private String key;

    @JsonView(value = {NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    @Schema(description = "Tipo dell'atto opponibile a terzi generato durante il processo di consegna")
    private LegalFactType type;
}
