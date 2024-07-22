package com.spring.shoestoreboot.services;

import com.spring.shoestoreboot.entities.Order;
import com.spring.shoestoreboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Order> getOrdersWaitForPay() {
        return orderRepository.findOrdersByStatusEqualsIgnoreCaseOrderByDateCreatedDesc("WAIT FOR PAY");
    }

    public Order newOrderOffline(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    public Order findById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order update(Order updatedOrder) {
        return orderRepository.save(updatedOrder);
    }
}
