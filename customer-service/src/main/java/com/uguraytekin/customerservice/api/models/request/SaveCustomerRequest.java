package com.uguraytekin.customerservice.api.models.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerRequest {
    private String name;
    private double creditLimit;
    private double creditReservation;
}

