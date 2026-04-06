package com.distributed.common.dto;

import lombok.Data;

@Data
public class UserSummaryResponseDTO {
    private Long userId;
    private String email;
    private String mobile;
    private String name;
}
