package it.pagopa.pn.api.dto.notification.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = { NotificationAttachmentValidator.class })
@Repeatable(ValidNotificationAttachment.List.class)
@Documented
public @interface ValidNotificationAttachment {

    String message() default "L'attachment caricato non è uno SHA256 valido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    @interface List{
        ValidNotificationAttachment[] value();
    }

}
