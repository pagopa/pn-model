package it.pagopa.pn.api.constraints;

import it.pagopa.pn.api.dto.notification.NotificationAttachment;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.Base64Utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckSha256Validator implements ConstraintValidator<CheckSha256, NotificationAttachment> {

    @Override
    public boolean isValid( NotificationAttachment attachment, ConstraintValidatorContext constraintValidatorContext) {
        String base64 = attachment.getBody();
        NotificationAttachment.Digests digests = attachment.getDigests();

        boolean isValid = true;
        if( digests != null && base64 != null && !base64.isBlank() ) {
            String expectedSha256Hex = digests.getSha256();
            if( expectedSha256Hex != null && ! expectedSha256Hex.isBlank() ) {
                byte[] data = Base64Utils.decodeFromString( base64 );
                String computedSha256 = DigestUtils.sha256Hex(data);
                isValid = expectedSha256Hex.equalsIgnoreCase(computedSha256);
            }
        }

        return isValid;
    }
}
