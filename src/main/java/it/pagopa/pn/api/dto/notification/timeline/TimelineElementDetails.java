package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "category")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ReceivedDetails.class, name = TimelineElementCategory.ConstValue.REQUEST_ACCEPTED_VALUE),
        @JsonSubTypes.Type(value = SendCourtesyMessageDetails.class, name = TimelineElementCategory.ConstValue.SEND_COURTESY_MESSAGE_VALUE),
        @JsonSubTypes.Type(value = NotificationPathChooseDetails.class, name = TimelineElementCategory.ConstValue.NOTIFICATION_PATH_CHOOSE_VALUE),
        @JsonSubTypes.Type(value = GetAddressInfo.class, name = TimelineElementCategory.ConstValue.GET_ADDRESS_VALUE),
        @JsonSubTypes.Type(value = PublicRegistryCallDetails.class, name = TimelineElementCategory.ConstValue.PUBLIC_REGISTRY_CALL_VALUE),
        @JsonSubTypes.Type(value = PublicRegistryResponseDetails.class, name = TimelineElementCategory.ConstValue.PUBLIC_REGISTRY_RESPONSE_VALUE),
        @JsonSubTypes.Type(value = ScheduleAnalogWorkflow.class, name = TimelineElementCategory.ConstValue.SCHEDULE_ANALOG_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = ScheduleDigitalWorkflow.class, name = TimelineElementCategory.ConstValue.SCHEDULE_DIGITAL_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = SendDigitalDetails.class, name = TimelineElementCategory.ConstValue.SEND_DIGITAL_DOMICILE_VALUE),
        @JsonSubTypes.Type(value = SendDigitalFeedbackDetails.class, name = TimelineElementCategory.ConstValue.SEND_DIGITAL_DOMICILE_FEEDBACK_VALUE),
        @JsonSubTypes.Type(value = SendDigitalFeedback.class, name = TimelineElementCategory.ConstValue.SEND_DIGITAL_FEEDBACK_VALUE),
        @JsonSubTypes.Type(value = SendDigitalFailureDetails.class, name = TimelineElementCategory.ConstValue.SEND_DIGITAL_DOMICILE_FAILURE_VALUE),
        @JsonSubTypes.Type(value = RefinementDetails.class, name = TimelineElementCategory.ConstValue.REFINEMENT_VALUE),
        @JsonSubTypes.Type(value = ScheduleRefinement.class, name = TimelineElementCategory.ConstValue.SCHEDULE_REFINEMENT_VALUE),
        @JsonSubTypes.Type(value = DigitalSuccessWorkflow.class, name = TimelineElementCategory.ConstValue.DIGITAL_SUCCESS_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = DigitalFailureWorkflow.class, name = TimelineElementCategory.ConstValue.DIGITAL_FAILURE_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = AnalogSuccessWorkflow.class, name = TimelineElementCategory.ConstValue.ANALOG_SUCCESS_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = AnalogFailureWorkflow.class, name = TimelineElementCategory.ConstValue.ANALOG_FAILURE_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = SimpleRegisteredLetterDetails.class, name = TimelineElementCategory.ConstValue.SEND_SIMPLE_REGISTERED_LETTER_VALUE),
        @JsonSubTypes.Type(value = EndOfDigitalDeliveryWorkflowDetails.class, name = TimelineElementCategory.ConstValue.END_OF_DIGITAL_DELIVERY_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = EndOfAnalogDeliveryWorkflowDetails.class, name = TimelineElementCategory.ConstValue.END_OF_ANALOG_DELIVERY_WORKFLOW_VALUE),
        @JsonSubTypes.Type(value = NotificationViewedDetails.class, name = TimelineElementCategory.ConstValue.NOTIFICATION_VIEWED_VALUE),
        @JsonSubTypes.Type(value = SendPaperDetails.class, name = TimelineElementCategory.ConstValue.SEND_ANALOG_DOMICILE_VALUE),
        @JsonSubTypes.Type(value = SendPaperFeedbackDetails.class, name = TimelineElementCategory.ConstValue.SEND_PAPER_FEEDBACK_VALUE),
        @JsonSubTypes.Type(value = CompletelyUnreachableDetails.class, name = TimelineElementCategory.ConstValue.COMPLETELY_UNREACHABLE_VALUE),
        @JsonSubTypes.Type(value = RequestRefusedDetails.class, name = TimelineElementCategory.ConstValue.REQUEST_REFUSED_VALUE)
})
public interface TimelineElementDetails {

}
