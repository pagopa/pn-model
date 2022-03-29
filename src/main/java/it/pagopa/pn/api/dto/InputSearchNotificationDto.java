package it.pagopa.pn.api.dto;

import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.Instant;
import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
public class InputSearchNotificationDto {
    @NotEmpty
    private final String senderReceiverId;
    
    @NotNull
    private Instant startDate;
    
    @NotNull
    private final Instant endDate;
    
    private final String filterId;
    
    private NotificationStatus status;

    private final List<String> groups;
    
    private final String subjectRegExp;

    private final String iunMatch;

    @Positive
    @NotNull
    private final Integer size;
    
    private final String nextPagesKey;
    
    private final boolean bySender;

    public InputSearchNotificationDto(String senderReceiverId, Instant startDate, Instant endDate, String filterId, NotificationStatus status,
                                      List<String> groups, String subjectRegExp, String iunMatch, Integer size, String nextPagesKey, boolean bySender) {
        this.senderReceiverId = senderReceiverId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.filterId = filterId;
        this.status = status;
        this.groups = groups;
        this.subjectRegExp = subjectRegExp;
        this.iunMatch = iunMatch;
        this.size = size;
        this.nextPagesKey = nextPagesKey;
        this.bySender = bySender;
    }

    public void setStartDate(Instant startDate){
        this.startDate = startDate;
    }
    
    public void setStatus(NotificationStatus status){
        this.status = status;
    }
    
    public static class Builder
    {
        private String senderReceiverId;
        private Instant startDate;
        private Instant endDate;
        private String filterId;
        private NotificationStatus status;
        private String subjectRegExp;
        private String iunMatch;
        private Integer size;
        private String nextPagesKey;
        private boolean bySender;
        private List<String> groups;

        public Builder() {}
        
        public Builder bySender(boolean bySender) {
            this.bySender = bySender;
            return this;
        }

        public Builder senderReceiverId(String senderReceiverId) {
            this.senderReceiverId = senderReceiverId;
            return this;
        }

        public Builder startDate(Instant startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(Instant endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder filterId(String filterId) {
            this.filterId = filterId;
            return this;
        }

        public Builder status(NotificationStatus status) {
            this.status = status;
            return this;
        }

        public Builder subjectRegExp(String subjectRegExp) {
            this.subjectRegExp = subjectRegExp;
            return this;
        }

        public Builder iunMatch(String iunMatch) {
            this.iunMatch = iunMatch;
            return this;
        }

        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public Builder nextPagesKey(String nextPagesKey) {
            this.nextPagesKey = nextPagesKey;
            return this;
        }

        public Builder groups(List<String> groups) {
            this.groups = groups;
            return this;
        }
        
        public InputSearchNotificationDto build() {
           return new InputSearchNotificationDto(senderReceiverId, startDate, endDate, filterId, status,
                   groups, subjectRegExp, iunMatch, size, nextPagesKey, bySender);
        }
        
    }
    
}
