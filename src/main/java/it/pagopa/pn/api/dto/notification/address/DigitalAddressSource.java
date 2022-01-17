package it.pagopa.pn.api.dto.notification.address;

import it.pagopa.pn.api.dto.notification.timeline.NotificationPathChooseDetails;

public enum DigitalAddressSource {
    PLATFORM() {
        @Override
        public DigitalAddress getAddressFrom(NotificationPathChooseDetails notificationPathChooseDetails) {
            return notificationPathChooseDetails.getPlatform();
        }
    },
    SPECIAL() {
        @Override
        public DigitalAddress getAddressFrom(NotificationPathChooseDetails notificationPathChooseDetails) {
            return notificationPathChooseDetails.getSpecial();
        }
    },
    GENERAL() {
        @Override
        public DigitalAddress getAddressFrom(NotificationPathChooseDetails notificationPathChooseDetails) {
            return notificationPathChooseDetails.getGeneral();
        }
    };

    public DigitalAddress getAddressFrom(NotificationPathChooseDetails notificationPathChooseDetails) {
        throw new UnsupportedOperationException("Must be implemented for each element");
    }

    public DigitalAddressSource next() {
        switch (this) {
            case PLATFORM:
                return SPECIAL;
            case SPECIAL:
                return GENERAL;
            case GENERAL:
                return PLATFORM;
            default:
                throw new RuntimeException(" BUG: add support to next for " + this.getClass() + "::" + this.name());
        }
    }
}
