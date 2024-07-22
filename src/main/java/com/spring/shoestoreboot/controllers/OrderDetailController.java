package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.OrderDetail;
import com.spring.shoestoreboot.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order-details")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping("/{id}")
    public Iterable<OrderDetail> getAllOrderDetailsByOrderId(@PathVariable Integer id) {
        return orderDetailService.getOrderDetailByOrderId(id);
    }

    @PostMapping()
    public OrderDetail createOrderDetail(@RequestBody OrderDetail orderDetail) {
        return orderDetailService.save(orderDetail);
    }

    @GetMapping("/details/{id}")
    public OrderDetail getOrderDetailById(@PathVariable Integer id) {
        return orderDetailService.findById(id);
    }

    @PutMapping("/details/{id}")
    public OrderDetail updateOrderDetail(@PathVariable Integer id, @RequestBody OrderDetail updatedOrderDetail) {
        updatedOrderDetail.setId(id);
        return orderDetailService.save(updatedOrderDetail);
    }

    @DeleteMapping("/details/{id}")
    public void deleteOrderDetail(@PathVariable Integer id) {
        orderDetailService.deleteById(id);
    }
}
