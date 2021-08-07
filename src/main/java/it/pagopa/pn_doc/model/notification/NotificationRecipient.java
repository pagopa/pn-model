package it.pagopa.pn_doc.model.notification;


import it.pagopa.pn_doc.model.notification.address.DigitalAddress;
import it.pagopa.pn_doc.model.notification.address.PhysicalAddress;
import it.pagopa.pn.model.notification.INotificationRecipient;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NotificationRecipient implements INotificationRecipient {

    private String fc;
    private DigitalAddress digitalDomicile;
    private PhysicalAddress physicalAddress;
}
