package com.uguraytekin.orderservice.api.entity;

import com.uguraytekin.orderservice.api.model.enums.OrderStateEnum;
import com.uguraytekin.orderservice.api.model.enums.RejectReasonEnum;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_tb")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int customerId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStateEnum state;

    @Enumerated(EnumType.STRING)
    private RejectReasonEnum rejectReason;

    @Column(nullable = false)
    private double amount;
}
