package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.entities.Order;
import com.spring.shoestoreboot.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

    Iterable<OrderDetail> findOrderDetailsByIdOrders(Order idOrders);

}