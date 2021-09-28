package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationSender {

    @Schema( description = "Identificativo IPA della PA")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Received.class})
    @NotBlank(groups = { NotificationJsonViews.New.class })
    private String paId;

    @Schema( description = "Denominazione IPA della PA mittente")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Received.class})
    private String paDenomination;
    
    @Schema( description = "Denominazione IPA della PA mittente")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Received.class})
    private String taxId;

    //FIXME RIMUOVERE: al momento in fase di generazione di una Notifica non è prevista la valorizzazione del C.F. mittente
    public String getTaxId(String paId) {
		return "TaxId della pa " + paId;
	}
    
}
