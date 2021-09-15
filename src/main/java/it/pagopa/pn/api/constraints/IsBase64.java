package it.pagopa.pn.api.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint( validatedBy = IsBase64Validator.class )
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(IsBase64.List.class)
@Documented
public @interface IsBase64 {

    String message() default "{it.pagopa.pn.validation.constraints.IsBase64.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    @Target({ ElementType.FIELD })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        IsBase64[] value();
    }
}
