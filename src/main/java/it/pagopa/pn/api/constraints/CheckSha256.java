package it.pagopa.pn.api.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint( validatedBy = CheckSha256Validator.class )
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(CheckSha256.List.class)
@Documented
public @interface CheckSha256 {

    String message() default "{it.pagopa.pn.validation.constraints.CheckSha256.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
ssadf
    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        CheckSha256[] value();
    }
}
