package com.distributed.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserProfileResponseDTO {
    private Long userId;
    private String email;
    private String mobile;
    private String name;
    private List<MasterPassengerResponseDTO> masterPassengers;
}
