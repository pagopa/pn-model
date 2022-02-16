package it.pagopa.pn.api.dto;

import it.pagopa.pn.api.dto.notification.status.NotificationStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@EqualsAndHashCode
@ToString
@Getter
public class InputSearchNotificationDto {
    private String senderReceiverId;
    private Instant startDate;
    private Instant endDate;
    private String filterId;
    private NotificationStatus status;
    private String subjectRegExp;
    private Integer size;
    private String nextPagesKey;
    private boolean bySender;
    
    public void setStartDate(Instant startDate){
        this.startDate = startDate;
    }
    
    public void setStatus(NotificationStatus status){
        this.status = status;
    }
    
    private InputSearchNotificationDto(Builder searchDtoBuilder){
        this.senderReceiverId = searchDtoBuilder.senderReceiverId;
        this.startDate = searchDtoBuilder.startDate;
        this.endDate = searchDtoBuilder.endDate;
        this.filterId = searchDtoBuilder.filterId;
        this.status = searchDtoBuilder.status;
        this.subjectRegExp = searchDtoBuilder.subjectRegExp;
        this.size = searchDtoBuilder.size;
        this.nextPagesKey = searchDtoBuilder.nextPagesKey;
        this.bySender = searchDtoBuilder.bySender;
    }
    
    public static class Builder
    {
        private String senderReceiverId;
        private Instant startDate;
        private Instant endDate;
        private String filterId;
        private NotificationStatus status;
        private String subjectRegExp;
        private Integer size;
        private String nextPagesKey;
        private boolean bySender;
        
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

        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public Builder nextPagesKey(String nextPagesKey) {
            this.nextPagesKey = nextPagesKey;
            return this;
        }
        
        //Return the finally consrcuted User object
        public InputSearchNotificationDto build() {
            InputSearchNotificationDto searchDto =  new InputSearchNotificationDto(this);
            validateUserObject(searchDto);
            return searchDto;
        }
        
        private void validateUserObject(InputSearchNotificationDto searchDto) {
        }
    }
    
}
