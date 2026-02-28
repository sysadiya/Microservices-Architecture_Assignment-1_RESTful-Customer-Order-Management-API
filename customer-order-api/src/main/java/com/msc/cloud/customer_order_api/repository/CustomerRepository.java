package com.msc.cloud.customer_order_api.repository;

import com.msc.cloud.customer_order_api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


