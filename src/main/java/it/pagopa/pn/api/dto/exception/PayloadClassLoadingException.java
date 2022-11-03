package it.pagopa.pn.api.dto.exception;

public class PayloadClassLoadingException extends RuntimeException {

    public PayloadClassLoadingException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
