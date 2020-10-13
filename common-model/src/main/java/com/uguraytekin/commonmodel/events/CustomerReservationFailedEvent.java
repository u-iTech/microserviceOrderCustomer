package com.uguraytekin.commonmodel.events;

import com.uguraytekin.commonmodel.enums.RejectReasonEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerReservationFailedEvent {
    private Integer orderId;
    private double amount;
    private RejectReasonEnum rejectReason;
}
