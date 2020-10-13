package com.uguraytekin.orderservice.api.model.dto;

import com.uguraytekin.orderservice.api.model.enums.OrderStateEnum;
import com.uguraytekin.orderservice.api.model.enums.RejectReasonEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private int id;
    private int customerId;
    private OrderStateEnum state;
    private RejectReasonEnum rejectReason;
    private double amount;

}
