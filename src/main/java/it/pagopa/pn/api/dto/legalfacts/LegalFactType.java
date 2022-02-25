package it.pagopa.pn.api.dto.legalfacts;

import it.pagopa.pn.api.dto.events.EventPublisher;

public enum LegalFactType {
	SENDER_ACK(EventPublisher.DELIVERY_PUSH),
	DIGITAL_DELIVERY(EventPublisher.DELIVERY_PUSH),
	ANALOG_DELIVERY(EventPublisher.EXTERNAL_CHANNELS),
	RECIPIENT_ACCESS(EventPublisher.DELIVERY_PUSH);

	private final EventPublisher source;

	LegalFactType(EventPublisher source) {
		this.source = source;
	}
}
