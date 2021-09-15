package it.pagopa.pn.api.dto.notification.annotation;

import it.pagopa.pn.api.dto.notification.NotificationAttachment;
import org.apache.commons.codec.digest.DigestUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Base64;

public class NotificationAttachmentValidator implements ConstraintValidator<ValidNotificationAttachment, NotificationAttachment> {

    @Override
    public void initialize(ValidNotificationAttachment constraintAnnotation) {
    }

    @Override
    public boolean isValid(NotificationAttachment value, ConstraintValidatorContext context) {
        if (value!=null && value.getDigests()!=null && value.getDigests().getSha256()!=null && value.getBody()!=null) {
            if(value.getBody().matches("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")) {
                byte[] base64Decoded = Base64.getDecoder().decode(value.getBody());
                String sha256 = DigestUtils.sha256Hex(base64Decoded);
                if (value.getDigests().getSha256().equals(sha256)) {
                    return true;
                }
            }
        }
        return false;
    }
}
