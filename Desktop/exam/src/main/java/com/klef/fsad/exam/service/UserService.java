package com.klef.fsad.exam.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.entity.Order;
import com.klef.fsad.exam.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order getOrderById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Order updateEmployee(Long id, Order order) {
        Order existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setOrderId(order.getOrderId());
            existing.setOrderName(order.getOrderName());
            existing.setOrderDate(order.getOrderDate());
            existing.setOrderStatus(order.getOrderStatus());
            return repository.save(existing);
        }

        return null;
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }

	public Order updateOrder(Long id, Order order) {
		// TODO Auto-generated method stub
		return null;
	}
}
