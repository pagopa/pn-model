package it.pagopa.pn.api.dto.events;

import lombok.Data;

import java.time.Instant;

@Data
public class PnOnboardInstitutionPayload {

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
    private String ipaCode;
    private String sdiCode;

}
