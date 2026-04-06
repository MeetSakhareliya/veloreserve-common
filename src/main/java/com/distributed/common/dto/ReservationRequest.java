package com.distributed.common.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    @NotNull(message = "User ID is required")
    private Long userId;

    @NotEmpty(message = "Passenger list can't be empty")
    private List<Long> masterPassengerIdList;

    @NotNull(message = "Trip id can't be null")
    private Long tripId;
}
