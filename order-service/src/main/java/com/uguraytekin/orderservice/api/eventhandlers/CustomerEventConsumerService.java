package com.uguraytekin.orderservice.api.eventhandlers;

import com.uguraytekin.orderservice.api.model.request.ApproveOrderRequest;
import com.uguraytekin.orderservice.api.model.request.RejectOrderRequest;
import com.uguraytekin.orderservice.api.service.OrderService;
import com.uguraytekin.commonmodel.events.CustomerReservationFailedEvent;
import com.uguraytekin.commonmodel.events.CustomerReserveEvent;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class CustomerEventConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerEventConsumerService.class);

    private final OrderService orderService;
    private final ModelMapper mapper;

    public CustomerEventConsumerService(OrderService orderService, ModelMapper mapper) {
        this.orderService = orderService;
        this.mapper = mapper;
    }

    @KafkaListener(topics = "CustomerCreditReservedEvent")
    public void customerCreditReservedEvent(CustomerReserveEvent customerReserveEvent) {
        LOGGER.info("received {}", customerReserveEvent);
        orderService.approveOrder(mapper.map(customerReserveEvent, ApproveOrderRequest.class));
    }


    @KafkaListener(topics = "CustomerCreditReservationFailedEvent")
    public void customerCreditReservationFailedEvent(CustomerReservationFailedEvent customerReservationFailedEvent) {
        LOGGER.info("received {}", customerReservationFailedEvent);

        orderService.rejectOrder(mapper.map(customerReservationFailedEvent, RejectOrderRequest.class));

    }

}
