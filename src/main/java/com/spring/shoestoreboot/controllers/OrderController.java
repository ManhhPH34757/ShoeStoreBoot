package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Order;
import com.spring.shoestoreboot.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public Order newOrderOffline(@RequestBody Order order) {
        return orderService.newOrderOffline(order);
    }

    @GetMapping("/wait-for-pay")
    public Iterable<Order> getOrdersWaitForPay() {
        return orderService.getOrdersWaitForPay();
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.findById(id);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Integer id, @RequestBody Order updatedOrder) {
        updatedOrder.setId(id);
        return orderService.update(updatedOrder);
    }

}
