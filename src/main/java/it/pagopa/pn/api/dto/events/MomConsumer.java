package it.pagopa.pn.api.dto.events;

import java.time.Duration;
import java.util.List;

public interface MomConsumer<T> {

    List<T> poll(Duration maxPollTime);

}
