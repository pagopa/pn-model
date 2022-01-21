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
                    "%s_send_courtesy_message_%s_index_%d",
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
                    "%s_get_address%s_source_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getSource(),
                    eventId.getIndex()
            );
        }
    },

    SEND_DIGITAL_FEEDBACK() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_digital_feedback_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getIndex()
            );
        }
    },

    SEND_PAPER_FEEDBACK() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_paper_feedback_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getIndex()
            );
        }
    },
    SEND_DIGITAL_DOMICILE() {
        @Override
        public String buildEventId(EventId eventId) {
            int sendAttempt = eventId.getIndex() + 1; //TODO Nell'invio verso external channel viene incrementato il numero di tentativi effettuati (in questo modo viene passato il tentativo che si sta effettuando) per preservare le logiche di extchannel attualmente presenti
            return String.format(
                    "%s_send_digital_domicile%s_source_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    eventId.getSource(),
                    sendAttempt
            );
        }
    },

    SEND_SIMPLE_REGISTERED_LETTER() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_simple_registered_letter_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    SEND_ANALOG_DOMICILE() {
        @Override
        public String buildEventId(EventId eventId) {
            int sendAttempt = eventId.getIndex() + 1; //TODO Nell'invio verso external channel viene incrementato il numero di tentativi effettuati (in questo modo viene passato il tentativo che si sta effettuando) per preservare le logiche di extchannel attualmente presenti
            return String.format(
                    "%s_send_analog_domicile_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecipientId(),
                    sendAttempt
            );
        }
    },

    DIGITAL_SUCCESS_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_digital_success_workflow_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    DIGITAL_FAILURE_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_digital_failure_workflow_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    ANALOG_SUCCESS_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_analog_success_workflow_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    ANALOG_FAILURE_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_analog_failure_workflow_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    NOTIFICATION_VIEWED() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_notification_viewed_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    COMPLETELY_UNREACHABLE() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_completely_unreachable_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    REFINEMENT() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_refinement_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    SCHEDULE_DIGITAL_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_schedule_digital_workflow_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    SCHEDULE_ANALOG_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_schedule_analog_workflow_%s",
                    eventId.getIun(),
                    eventId.getRecipientId()
            );
        }
    },

    SCHEDULE_REFINEMENT_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_schedule_refinement_workflow_%s",
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
