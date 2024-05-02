package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "payloadType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PnF24PdfSetReadyEvent.Detail.class, name = "PnF24PdfSetReadyEvent"),
        @JsonSubTypes.Type(value = PnF24MetadataValidationEndEvent.Detail.class, name = "PnF24MetadataValidationEndEvent")
})
public interface DetailedTypePayload {

}
