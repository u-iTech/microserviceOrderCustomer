package com.uguraytekin.orderservice.api.model.response;

import com.uguraytekin.orderservice.api.model.enums.OrderStateEnum;
import com.uguraytekin.orderservice.api.model.enums.RejectReasonEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrderResponse{
    private int id;
    private int customerId;
    private OrderStateEnum state;
    private RejectReasonEnum rejectReason;
    private double amount;
}
