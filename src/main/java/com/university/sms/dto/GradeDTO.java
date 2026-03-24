package com.university.sms.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GradeDTO {
    private Long gradeId;
    private Long enrollmentId;
    private Long studentId;
    private Double examScore;
    private Double assignmentScore;
    private Double projectScore;
    private Double participationScore;
    private Double finalGrade;
    private String letterGrade;
    private Double gradePoint;
    private Long semesterId;
    private String remarks;
}