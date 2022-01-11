package it.pagopa.pn.api.dto.notification.timeline;

public enum TimelineElementCategory {
    REQUEST_ACCEPTED(ReceivedDetails.class),
    SEND_COURTESY_MESSAGE(SendCourtesyMessageDetails.class),
    NOTIFICATION_PATH_CHOOSE(NotificationPathChooseDetails.class),
    GET_ADDRESS(GetAddressInfo.class),
    PUBLIC_REGISTRY_CALL(PublicRegistryCallDetails.class),
    PUBLIC_REGISTRY_RESPONSE(PublicRegistryResponseDetails.class),
    SEND_DIGITAL_DOMICILE(SendDigitalDetails.class),
    SEND_DIGITAL_FEEDBACK_FAILURE(SendDigitalFeedbackFailure.class),
    SEND_DIGITAL_DOMICILE_FEEDBACK(SendDigitalFeedbackDetails.class),
    SEND_DIGITAL_DOMICILE_FAILURE(SendDigitalFailureDetails.class),
    REFINEMENT(RefinementDetails.class),
    DIGITAL_SUCCESS_WORKFLOW(DigitalSuccessWorkflow.class),
    DIGITAL_FAILURE_WORKFLOW(DigitalFailureWorkflow.class),
    ANALOG_SUCCESS_WORKFLOW(AnalogSuccessWorkflow.class),
    ANALOG_FAILURE_WORKFLOW(AnalogFailureWorkflow.class),
    SEND_SIMPLE_REGISTERED_LETTER(SimpleRegisteredLetterDetails.class),
    END_OF_DIGITAL_DELIVERY_WORKFLOW(EndOfDigitalDeliveryWorkflowDetails.class),
    END_OF_ANALOG_DELIVERY_WORKFLOW(EndOfAnalogDeliveryWorkflowDetails.class),
    NOTIFICATION_VIEWED(NotificationViewedDetails.class),
    SEND_ANALOG_DOMICILE(SendPaperDetails.class),
    SEND_PAPER_FEEDBACK(SendPaperFeedbackDetails.class),
    PAYMENT(null),
    COMPLETELY_UNREACHABLE(CompletlyUnreachableDetails.class);

    private final Class<? extends TimelineElementDetails> detailsJavaClass;

    private TimelineElementCategory(Class<? extends TimelineElementDetails> detailsJavaClass) {
        this.detailsJavaClass = detailsJavaClass;
    }

    public Class<? extends TimelineElementDetails> getDetailsJavaClass() {
        return this.detailsJavaClass;
    }
}
