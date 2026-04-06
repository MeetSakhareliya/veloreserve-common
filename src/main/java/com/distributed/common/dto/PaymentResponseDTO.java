package com.distributed.common.dto;

import com.distributed.common.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDTO {
    private UUID paymentId;
    private BigDecimal totalAmount;
    private String method;
    private PaymentStatus status;

    public PaymentResponseDTO(BigDecimal totalAmount, String method, PaymentStatus status){
        this.totalAmount = totalAmount;
        this.method = method;
        this.status = status;
    }
}
