package it.pagopa.pn.api.dto.events;

import lombok.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class PnDeliveryPaymentEvent implements GenericFifoEvent<StandardEventHeader, PnDeliveryPaymentEvent.Payload> {

    private StandardEventHeader header;

    private Payload payload;

    private String messageDeduplicationId;

    private String messageGroupId;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder(toBuilder = true)
    @EqualsAndHashCode
    @ToString
    public static class Payload {

        //@Schema( description = "Identificativo univoco della richiesta" )
        @NotEmpty
        private String iun;

        //@Schema( description = "Indice dell'array del destinatario della notifica" )
        private int recipientIdx;

        //@Schema( description = "Tipo di destinatario PF|PG" )
        @NotNull
        private RecipientType recipientType;

        //@Schema( description = "Tipo di pagamento PAGOPA|F24" )
        @NotNull
        private PaymentType paymentType;

        //@Schema( description = "Data di pagamento")
        @NotNull
        private Instant paymentDate;

        //@Schema( description = "indica se la data di pagamento é incerta")
        private boolean uncertainPaymentDate;

        //@Schema( description = "Codice fiscale dell'ente creditore. Obbligatorio in caso PaymentType PAGOPA")
        private String creditorTaxId;

        //@Schema( description = "Numero della posizione debitoria. Obbligatorio in caso PaymentType PAGOPA")
        private String noticeCode;

        //@Schema( description = "Canale sorgente info di pagamento")
        @NotNull
        private String paymentSourceChannel;

        //@Schema( description = "Importo di pagamento in eurocent")
        private Integer amount;

    }

    public enum RecipientType {
        PF("PF"),

        PG("PG");

        private final String value;

        RecipientType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public enum PaymentType {
        PAGOPA("PAGOPA"),

        F24("F24");

        private final String value;

        PaymentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


}
