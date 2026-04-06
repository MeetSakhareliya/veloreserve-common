package com.distributed.common.dto;

import lombok.Data;

@Data
public class MasterPassengerResponseDTO {
    private Long id;
    private Long userId;
    private String name;
    private Integer age;
    private String gender;
}
