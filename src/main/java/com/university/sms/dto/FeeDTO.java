package com.university.sms.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeeDTO {
    private Long feeId;
    private Long studentId;
    private Double amount;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private String status;
    private Double fineAmount;
    private String description;
    private String invoiceNumber;
}