package it.pagopa.pn.api.dto.notification.timeline;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AnalogFailureWorkflow.class, name = "AnalogFailureWorkflow"),
        @JsonSubTypes.Type(value = AnalogSuccessWorkflow.class, name = "AnalogSuccessWorkflow"),
        @JsonSubTypes.Type(value = CompletlyUnreachableDetails.class, name = "CompletlyUnreachableDetails"),
        @JsonSubTypes.Type(value = DigitalFailureWorkflow.class, name = "DigitalFailureWorkflow"),
        @JsonSubTypes.Type(value = DigitalSuccessWorkflow.class, name = "DigitalSuccessWorkflow"),
        @JsonSubTypes.Type(value = EndOfAnalogDeliveryWorkflowDetails.class, name = "EndOfAnalogDeliveryWorkflowDetails"),
        @JsonSubTypes.Type(value = EndOfDigitalDeliveryWorkflowDetails.class, name = "EndOfDigitalDeliveryWorkflowDetails"),
        @JsonSubTypes.Type(value = GetAddressInfo.class, name = "GetAddressInfo"),
        @JsonSubTypes.Type(value = NotificationPathChooseDetails.class, name = "NotificationPathChooseDetails"),
        @JsonSubTypes.Type(value = NotificationViewedDetails.class, name = "NotificationViewedDetails"),
        @JsonSubTypes.Type(value = PublicRegistryCallDetails.class, name = "PublicRegistryCallDetails"),
        @JsonSubTypes.Type(value = PublicRegistryResponseDetails.class, name = "PublicRegistryResponseDetails"),
        @JsonSubTypes.Type(value = ReceivedDetails.class, name = "ReceivedDetails"),
        @JsonSubTypes.Type(value = RefinementDetails.class, name = "RefinementDetails"),
        @JsonSubTypes.Type(value = RequestRefusedDetails.class, name = "RequestRefusedDetails"),
        @JsonSubTypes.Type(value = ScheduleAnalogWorkflow.class, name = "ScheduleAnalogWorkflow"),
        @JsonSubTypes.Type(value = ScheduleDigitalWorkflow.class, name = "ScheduleDigitalWorkflow"),
        @JsonSubTypes.Type(value = ScheduleRefinement.class, name = "ScheduleRefinement"),
        @JsonSubTypes.Type(value = SendCourtesyMessageDetails.class, name = "SendCourtesyMessageDetails"),
        @JsonSubTypes.Type(value = SendDigitalDetails.class, name = "SendDigitalDetails"),
        @JsonSubTypes.Type(value = SendDigitalFailureDetails.class, name = "SendDigitalFailureDetails"),
        @JsonSubTypes.Type(value = SendDigitalFeedbackDetails.class, name = "SendDigitalFeedbackDetails"),
        @JsonSubTypes.Type(value = SendPaperDetails.class, name = "SendPaperDetails"),
        @JsonSubTypes.Type(value = SendPaperFeedbackDetails.class, name = "SendPaperFeedbackDetails"),
        @JsonSubTypes.Type(value = SimpleRegisteredLetterDetails.class, name = "SimpleRegisteredLetterDetails")
})
public interface TimelineElementDetails {

}
