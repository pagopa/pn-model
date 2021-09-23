package it.pagopa.pn.api.constraints;

import org.springframework.util.Base64Utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsBase64Validator implements ConstraintValidator<IsBase64, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean isBase64;
        if ( s != null && !s.isBlank() ) {
            try {
                Base64Utils.decodeFromString(s);
                isBase64 = true;
            }
            catch ( IllegalArgumentException exc ) {
                isBase64 = false;
            }
        }
        else {
            isBase64 = true; // check for not null or not empty left to other annotations
        }
        return isBase64;
    }
}
