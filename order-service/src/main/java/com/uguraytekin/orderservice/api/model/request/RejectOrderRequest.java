package com.uguraytekin.orderservice.api.model.request;


import com.uguraytekin.commonmodel.enums.RejectReasonEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RejectOrderRequest {
    private Integer orderId;
    private RejectReasonEnum rejectReason;
}
