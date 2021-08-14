package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class NotificationPaymentInfo {

    @Schema( name = "iuv", description = "Identificativo Univoco del Versamento" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private String iuv;

    @Schema( name = "notificationFeePolicy", description = "Politica di addebitamento dei costi di notifica" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private NotificationPaymentInfoFeePolicies notificationFeePolicy;

    @Schema( name = "f24", description = "Moduli di pagamento F24" )
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
    private F24 f24 ;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder( toBuilder = true )
    @EqualsAndHashCode
    public static class F24 {

        @Schema( name = "flatRate", description = "Modulo F24 per spese di notifica forfettarie" )
        @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        private NotificationAttachment flatRate;

        @Schema( name = "digital", description = "Modulo F24 per spese di notifica digitale" )
        @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        private NotificationAttachment digital;

        @Schema( name = "analog", description = "Modulo F24 per spese di notifica analogica" )
        @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class })
        private NotificationAttachment analog;
    }
}
