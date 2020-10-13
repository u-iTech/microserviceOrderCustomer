package com.uguraytekin.orderservice.api.model.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrderRequest {
    private int customerId;
    private double amount;
}
