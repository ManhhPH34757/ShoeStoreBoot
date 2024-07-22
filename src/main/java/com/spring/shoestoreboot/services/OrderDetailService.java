package com.spring.shoestoreboot.services;

import com.spring.shoestoreboot.entities.OrderDetail;
import com.spring.shoestoreboot.repositories.OrderDetailRepository;
import com.spring.shoestoreboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Iterable<OrderDetail> getOrderDetailByOrderId(Integer orderId) {
        return orderDetailRepository.findOrderDetailsByIdOrders(orderRepository.findById(orderId).orElse(null));
    }

    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    public OrderDetail findById(Integer id) {
        return orderDetailRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id) {
        orderDetailRepository.deleteById(id);
    }
}
