package it.pagopa.pn.api.dto.exception;

public class SQSSendMessageException extends RuntimeException {

    public SQSSendMessageException(String message) {
        super(message);
    }
}
