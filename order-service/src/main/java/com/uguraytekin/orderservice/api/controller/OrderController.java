package com.uguraytekin.orderservice.api.controller;

import com.uguraytekin.orderservice.api.model.dto.OrderDto;
import com.uguraytekin.orderservice.api.model.request.SaveOrderRequest;
import com.uguraytekin.orderservice.api.model.response.SaveOrderResponse;
import com.uguraytekin.orderservice.api.service.OrderService;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;
    private final ModelMapper mapper;

    public OrderController(OrderService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping("/saveOrder")
    public ResponseEntity<SaveOrderResponse> saveOrder(@RequestBody SaveOrderRequest request) {
        return ResponseEntity.ok().body(mapper.map(service.saveOrder(request), SaveOrderResponse.class));
    }

    @GetMapping("/getOrderById/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable Integer id) throws NotFoundException {
        return ResponseEntity.ok().body(service.getOrderById(id));
    }

    @GetMapping("/getOrderByCustomerId/{customerId}")
    public ResponseEntity<List<OrderDto>> getOrderByCustomerId(@PathVariable Integer customerId) {
        return ResponseEntity.ok().body(service.getOrderByCustomerId(customerId));
    }
}
