package it.pagopa.pn.api.dto.events;

import lombok.Data;

import java.time.Instant;

@Data
public class PnOnboardInstitutionPayload {

    public static final String STATUS_ACTIVE = "ACTIVE";
    public static final String STATUS_SUSPENDED = "SUSPENDED";

    private String id;
    private String status;
    private Instant lastUpdate;

    private Instant created;
    private String description;
    private String address;
    private String taxCode;
    private String zipCode;
    private String externalId;
    private String digitalAddress;

}
