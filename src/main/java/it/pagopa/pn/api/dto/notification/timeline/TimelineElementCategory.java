package it.pagopa.pn.api.dto.notification.timeline;

public enum TimelineElementCategory {
    REQUEST_ACCEPTED(ReceivedDetails.class, ConstValue.REQUEST_ACCEPTED_VALUE),
    SEND_COURTESY_MESSAGE(SendCourtesyMessageDetails.class, ConstValue.SEND_COURTESY_MESSAGE_VALUE), //NEW
    NOTIFICATION_PATH_CHOOSE(NotificationPathChooseDetails.class, ConstValue.NOTIFICATION_PATH_CHOOSE_VALUE),
    GET_ADDRESS(GetAddressInfo.class, ConstValue.GET_ADDRESS_VALUE),//NEW
    PUBLIC_REGISTRY_CALL(PublicRegistryCallDetails.class, ConstValue.PUBLIC_REGISTRY_CALL_VALUE),//NEW
    PUBLIC_REGISTRY_RESPONSE(PublicRegistryResponseDetails.class, ConstValue.PUBLIC_REGISTRY_RESPONSE_VALUE),//NEW
    SCHEDULE_ANALOG_WORKFLOW(ScheduleAnalogWorkflow.class, ConstValue.SCHEDULE_ANALOG_WORKFLOW_VALUE),//NEW
    SEND_DIGITAL_DOMICILE(SendDigitalDetails.class, ConstValue.SEND_DIGITAL_DOMICILE_VALUE),
    SEND_DIGITAL_DOMICILE_FEEDBACK(SendDigitalFeedbackDetails.class, ConstValue.SEND_DIGITAL_DOMICILE_FEEDBACK_VALUE),
    SEND_DIGITAL_DOMICILE_FAILURE(SendDigitalFailureDetails.class, ConstValue.SEND_DIGITAL_DOMICILE_FAILURE_VALUE),
    REFINEMENT(RefinementDetails.class, ConstValue.REFINEMENT_VALUE),
    SCHEDULE_REFINEMENT(ScheduleRefinement.class, ConstValue.SCHEDULE_REFINEMENT_VALUE),//NEW
    DIGITAL_SUCCESS_WORKFLOW(DigitalSuccessWorkflow.class, ConstValue.DIGITAL_SUCCESS_WORKFLOW_VALUE),//NEW
    DIGITAL_FAILURE_WORKFLOW(DigitalFailureWorkflow.class, ConstValue.DIGITAL_FAILURE_WORKFLOW_VALUE),//NEW
    ANALOG_SUCCESS_WORKFLOW(AnalogSuccessWorkflow.class, ConstValue.ANALOG_SUCCESS_WORKFLOW_VALUE),//NEW
    ANALOG_FAILURE_WORKFLOW(AnalogFailureWorkflow.class, ConstValue.ANALOG_FAILURE_WORKFLOW_VALUE),//NEW
    SEND_SIMPLE_REGISTERED_LETTER(SimpleRegisteredLetterDetails.class, ConstValue.SEND_SIMPLE_REGISTERED_LETTER_VALUE),//NEW
    END_OF_DIGITAL_DELIVERY_WORKFLOW(EndOfDigitalDeliveryWorkflowDetails.class, ConstValue.END_OF_DIGITAL_DELIVERY_WORKFLOW_VALUE),
    END_OF_ANALOG_DELIVERY_WORKFLOW(EndOfAnalogDeliveryWorkflowDetails.class, ConstValue.END_OF_ANALOG_DELIVERY_WORKFLOW_VALUE),
    NOTIFICATION_VIEWED(NotificationViewedDetails.class, ConstValue.NOTIFICATION_VIEWED_VALUE),
    SEND_ANALOG_DOMICILE(SendPaperDetails.class, ConstValue.SEND_ANALOG_DOMICILE_VALUE),
    SEND_PAPER_FEEDBACK(SendPaperFeedbackDetails.class, ConstValue.SEND_PAPER_FEEDBACK_VALUE),
    PAYMENT(null, ConstValue.PAYMENT_VALUE),
    COMPLETELY_UNREACHABLE(CompletelyUnreachableDetails.class, ConstValue.COMPLETELY_UNREACHABLE_VALUE),
    REQUEST_REFUSED(RequestRefusedDetails.class, ConstValue.REQUEST_REFUSED_VALUE);
    
    private final Class<? extends TimelineElementDetails> detailsJavaClass;
    private final String jsonValue;
    
    private TimelineElementCategory(Class<? extends TimelineElementDetails> detailsJavaClass, String value) {
        if(! this.name().equals(value)){
            throw new IllegalArgumentException("Value " +value+" must be equals to enum name "+this.name());
        }
        this.detailsJavaClass = detailsJavaClass;
        this.jsonValue = value;
    }
    
    public Class<? extends TimelineElementDetails> getDetailsJavaClass() {
        return this.detailsJavaClass;
    }
    
    public static class ConstValue {
        
        public static final String REQUEST_ACCEPTED_VALUE = "REQUEST_ACCEPTED";
        public static final String SEND_COURTESY_MESSAGE_VALUE = "SEND_COURTESY_MESSAGE";
        public static final String NOTIFICATION_PATH_CHOOSE_VALUE = "NOTIFICATION_PATH_CHOOSE";
        public static final String GET_ADDRESS_VALUE = "GET_ADDRESS";
        public static final String PUBLIC_REGISTRY_CALL_VALUE = "PUBLIC_REGISTRY_CALL";
        public static final String PUBLIC_REGISTRY_RESPONSE_VALUE = "PUBLIC_REGISTRY_RESPONSE";
        public static final String SCHEDULE_ANALOG_WORKFLOW_VALUE = "SCHEDULE_ANALOG_WORKFLOW";
        public static final String SCHEDULE_DIGITAL_WORKFLOW_VALUE = "SCHEDULE_DIGITAL_WORKFLOW";
        public static final String SEND_DIGITAL_DOMICILE_VALUE = "SEND_DIGITAL_DOMICILE";
        public static final String SEND_DIGITAL_DOMICILE_FEEDBACK_VALUE = "SEND_DIGITAL_DOMICILE_FEEDBACK";
        public static final String SEND_DIGITAL_FEEDBACK_VALUE = "SEND_DIGITAL_FEEDBACK";
        public static final String SEND_DIGITAL_DOMICILE_FAILURE_VALUE = "SEND_DIGITAL_DOMICILE_FAILURE";
        public static final String REFINEMENT_VALUE = "REFINEMENT";
        public static final String SCHEDULE_REFINEMENT_VALUE = "SCHEDULE_REFINEMENT";
        public static final String DIGITAL_SUCCESS_WORKFLOW_VALUE = "DIGITAL_SUCCESS_WORKFLOW";
        public static final String DIGITAL_FAILURE_WORKFLOW_VALUE = "DIGITAL_FAILURE_WORKFLOW";
        public static final String ANALOG_SUCCESS_WORKFLOW_VALUE = "ANALOG_SUCCESS_WORKFLOW";
        public static final String ANALOG_FAILURE_WORKFLOW_VALUE = "ANALOG_FAILURE_WORKFLOW";
        public static final String SEND_SIMPLE_REGISTERED_LETTER_VALUE = "SEND_SIMPLE_REGISTERED_LETTER";
        public static final String END_OF_DIGITAL_DELIVERY_WORKFLOW_VALUE = "END_OF_DIGITAL_DELIVERY_WORKFLOW";
        public static final String END_OF_ANALOG_DELIVERY_WORKFLOW_VALUE = "END_OF_ANALOG_DELIVERY_WORKFLOW";
        public static final String NOTIFICATION_VIEWED_VALUE = "NOTIFICATION_VIEWED";
        public static final String SEND_ANALOG_DOMICILE_VALUE = "SEND_ANALOG_DOMICILE";
        public static final String SEND_PAPER_FEEDBACK_VALUE = "SEND_PAPER_FEEDBACK";
        public static final String PAYMENT_VALUE = "PAYMENT";
        public static final String COMPLETELY_UNREACHABLE_VALUE = "COMPLETELY_UNREACHABLE";
        public static final String REQUEST_REFUSED_VALUE = "REQUEST_REFUSED";
        
        private ConstValue(){
        }
    }
}
