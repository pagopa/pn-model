package it.pagopa.pn.api.dto.notification.address;

public enum DigitalAddressType {
    PEC( false, true),
    EMAIL( true, false);

    DigitalAddressType(boolean validForCourtesyMessage, boolean validForLegalMessages) {
        this.validForCourtesyMessage = validForCourtesyMessage;
        this.validForLegalMessages = validForLegalMessages;
    }

    private final boolean validForCourtesyMessage;
    private final boolean validForLegalMessages;

    public boolean isValidForCourtesyMessage() {
        return validForCourtesyMessage;
    }

    public boolean isValidForLegalMessages() {
        return validForLegalMessages;
    }
}
