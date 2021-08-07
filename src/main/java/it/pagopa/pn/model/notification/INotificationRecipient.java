package it.pagopa.pn.model.notification;


import it.pagopa.pn.model.notification.address.IDigitalAddress;
import it.pagopa.pn.model.notification.address.IPhysicalAddress;

public interface INotificationRecipient {

    String getFc();
    IDigitalAddress getDigitalDomicile();
    IPhysicalAddress getPhysicalAddress();
}
