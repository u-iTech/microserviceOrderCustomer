package com.uguraytekin.customerservice.api.repository;

import com.uguraytekin.customerservice.api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
