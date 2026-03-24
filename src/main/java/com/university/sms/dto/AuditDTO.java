package com.university.sms.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditDTO {
    private Long auditId;
    private String entityType;
    private Long entityId;
    private String action;
    private String oldValue;
    private String newValue;
    private String modifiedBy;
    private LocalDateTime modifiedDate;
    private String description;
    private String ipAddress;
}