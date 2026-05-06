package it.pagopa.pn.api.dto.events.notificationcost.validation;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class UpdateNotificationCostResult {
    private PaymentInfoForRecipient paymentInfoForRecipient;
    private ResultEnum result;

    public enum ResultEnum {
        OK("OK"),

        KO("KO"),

        RETRY("RETRY");

        private final String value;

        ResultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
