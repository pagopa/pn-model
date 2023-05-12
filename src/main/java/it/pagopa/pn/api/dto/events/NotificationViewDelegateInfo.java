package it.pagopa.pn.api.dto.events;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationViewDelegateInfo {
    private String internalId;
    private String operatorUuid;
    private String mandateId;
    private DelegateType delegateType;

    public enum DelegateType {
        PF("PF"),

        PG("PG");

        private final String value;

        DelegateType(String value) {
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
