package com.uguraytekin.orderservice.api.model.request;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApproveOrderRequest {
    private Integer orderId;
    private Integer customerId;
}
