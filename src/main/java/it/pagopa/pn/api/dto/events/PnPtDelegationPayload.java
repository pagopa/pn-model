package it.pagopa.pn.api.dto.events;

import lombok.Data;

import java.time.Instant;

@Data
public class PnPtDelegationPayload {

    private String delegationId;
    private String delegationType;
    private String productId;
    private String status;
    private Boolean isTest;
    private String sourceEventId;
    private String sourceEventType;

    private Instant createdAt;
    private Instant updatedAt;
    private Instant closedAt;

    private String institutionId;
    private String institutionName;
    private String institutionRootName;
    private String institutionTaxCode;
    private String institutionType;

    private String ptId;
    private String ptName;
    private String ptTaxCode;
    private String ptType;

}
