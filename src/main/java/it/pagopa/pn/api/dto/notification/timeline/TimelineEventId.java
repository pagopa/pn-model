package it.pagopa.pn.api.dto.notification.timeline;

public enum TimelineEventId {//NEW

    REQUEST_ACCEPTED() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_request_accepted",
                    eventId.getIun()
            );
        }
    },
    SEND_COURTESY_MESSAGE() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_courtesy_message_%d_index_%d",
                    eventId.getIun(),
                    eventId.getRecIndex(),
                    eventId.getIndex()
            );
        }
    },
    GET_ADDRESS() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_get_address%d_source_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecIndex(),
                    eventId.getSource(),
                    eventId.getIndex()
            );
        }
    },

    SEND_DIGITAL_FEEDBACK() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_digital_feedback_%d_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecIndex(),
                    eventId.getIndex()
            );
        }
    },

    SEND_PAPER_FEEDBACK() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_paper_feedback_%d_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecIndex(),
                    eventId.getIndex()
            );
        }
    },
    SEND_DIGITAL_DOMICILE() {
        @Override
        public String buildEventId(EventId eventId) {
            int sendAttempt = eventId.getIndex() + 1; //TODO Nell'invio verso external channel viene incrementato il numero di tentativi effettuati (in questo modo viene passato il tentativo che si sta effettuando) per preservare le logiche di extchannel attualmente presenti
            return String.format(
                    "%s_send_digital_domicile%d_source_%s_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecIndex(),
                    eventId.getSource(),
                    sendAttempt
            );
        }
    },

    SEND_SIMPLE_REGISTERED_LETTER() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_send_simple_registered_letter_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    SEND_ANALOG_DOMICILE() {
        @Override
        public String buildEventId(EventId eventId) {
            int sendAttempt = eventId.getIndex() + 1; //TODO Nell'invio verso external channel viene incrementato il numero di tentativi effettuati (in questo modo viene passato il tentativo che si sta effettuando) per preservare le logiche di extchannel attualmente presenti
            return String.format(
                    "%s_send_analog_domicile_%d_attempt_%d",
                    eventId.getIun(),
                    eventId.getRecIndex(),
                    sendAttempt
            );
        }
    },

    DIGITAL_SUCCESS_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_digital_success_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    DIGITAL_FAILURE_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_digital_failure_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    ANALOG_SUCCESS_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_analog_success_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    ANALOG_FAILURE_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_analog_failure_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    NOTIFICATION_VIEWED() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_notification_viewed_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    COMPLETELY_UNREACHABLE() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_completely_unreachable_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    REFINEMENT() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_refinement_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    SCHEDULE_DIGITAL_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_schedule_digital_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    SCHEDULE_ANALOG_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_schedule_analog_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    SCHEDULE_REFINEMENT_WORKFLOW() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_schedule_refinement_workflow_%d",
                    eventId.getIun(),
                    eventId.getRecIndex()
            );
        }
    },

    REQUEST_REFUSED() {
        @Override
        public String buildEventId(EventId eventId) {
            return String.format(
                    "%s_request_refused",
                    eventId.getIun()
            );
        }
    }
    ;

    public String buildEventId(EventId eventId) {
        throw new UnsupportedOperationException("Must be implemented for each action type");
    }
}
