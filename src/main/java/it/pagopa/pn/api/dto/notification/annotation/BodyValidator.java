package it.pagopa.pn.api.dto.notification.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BodyValidator implements ConstraintValidator<ValidBody,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.matches("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")){
            return true;
        }else {
            return false;
        }
    }
}
