package it.pagopa.pn.api.dto.notification.timeline;

public enum TimelineEventId {

    REQUEST_ACCEPTED() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_request_accepted_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },
    SEND_COURTESY_MESSAGE() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_courtesy_message%s_index%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getIndex()
            );
        }
    },
    GET_ADDRESS() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_get_address%s_source_%s_attempt%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getSource(),
                    eventId.getIndex()
            );
        }
    },
    SEND_PAPER_FEEDBACK() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_paper_feedback%s_attempt%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getIndex()
            );
        }
    },
    SEND_DIGITAL_DOMICILE() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_digital_domicile%source_%s_attempt%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getSource(),
                    eventId.getIndex()
            );
        }
    },

    SEND_SIMPLE_REGISTERED_LETTER() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_simple_registered_letter%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    SEND_ANALOG_DOMICILE() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_analog_domicile%s_attempt%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getIndex()
            );
        }
    },

    DIGITAL_SUCCESS_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_digital_success_workflow%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    DIGITAL_FAILURE_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_success_workflow%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    ANALOG_SUCCESS_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_analog_success_workflow%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    ANALOG_FAILURE_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_analog_workflow%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },
    ;

    public String buildEventId(EventId eventId) {
        throw new UnsupportedOperationException("Must be implemented for each action type");
    }
}
