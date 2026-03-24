package com.university.sms.dto;

import lombok.*;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimeTableDTO {
    private Long timeTableId;
    private Long courseOfferingId;
    private Long facultyId;
    private Long roomId;
    private String dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private Long semesterId;
}