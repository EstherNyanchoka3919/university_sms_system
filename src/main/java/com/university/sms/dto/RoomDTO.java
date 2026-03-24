package com.university.sms.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomDTO {
    private Long roomId;
    private String roomNumber;
    private Integer capacity;
    private String roomType;
    private String building;
    private Integer floor;
    private Boolean hasProjector;
    private Boolean hasAc;
}