package it.pagopa.pn.api.dto.notification.annotation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SHA256Validator implements ConstraintValidator<SHA256,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value!= null && value.matches("^[A-Fa-f0-9]{64}$")){
            return true;
        }else {
            return false;
        }
    }
}
