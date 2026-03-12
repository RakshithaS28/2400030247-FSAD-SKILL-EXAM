package com.klef.fsad.exam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.entity.Order;
import com.klef.fsad.exam.service.UserService;

@RestController
@RequestMapping("/orders")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public Order createEmployee(@RequestBody Order order) {
        return service.saveOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        return service.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
        return "Employee Deleted Successfully";
    }
}