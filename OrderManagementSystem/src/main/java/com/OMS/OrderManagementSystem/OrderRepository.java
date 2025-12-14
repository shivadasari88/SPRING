package com.OMS.OrderManagementSystem;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // Fetch orders by customer name
    List<Order> findByCustomerName(String customerName);
}
