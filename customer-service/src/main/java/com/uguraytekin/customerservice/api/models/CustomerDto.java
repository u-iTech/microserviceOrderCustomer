package com.uguraytekin.customerservice.api.models;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private int id;
    private String name;
    private double creditLimit;
    private double creditReservation;

}
