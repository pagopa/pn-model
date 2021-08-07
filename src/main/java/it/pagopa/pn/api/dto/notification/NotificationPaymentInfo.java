package it.pagopa.pn.api.dto.notification;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class NotificationPaymentInfo {

    @Schema( name = "iuv", description = "Identificativo Univoco del Versamento" )
    private String iuv;

    @Schema( name = "notificationFeePolicy", description = "Politica di addebitamento dei costi di notifica" )
    private NotificationPaymentInfoFeePolicies notificationFeePolicy;

    @Schema( name = "f24", description = "Moduli di pagamento F24" )
    private F24 f24 ;

    @Value
    @Builder( toBuilder = true )
    public static class F24 {

        @Schema( name = "flatRate", description = "Modulo F24 per spese di notifica forfettarie" )
        private NotificationAttachment flatRate;

        @Schema( name = "digital", description = "Modulo F24 per spese di notifica digitale" )
        private NotificationAttachment digital;

        @Schema( name = "analog", description = "Modulo F24 per spese di notifica analogica" )
        private NotificationAttachment analog;
    }
}
