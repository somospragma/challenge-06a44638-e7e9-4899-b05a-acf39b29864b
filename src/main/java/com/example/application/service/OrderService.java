package com.example.application.service;

import com.example.domain.model.Order;
import com.example.infrastructure.persistence.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(String customerId, List<OrderItem> items) {
        Order order = new Order(UUID.randomUUID(), customerId, "CREATED", items);
        return orderRepository.save(order);
    }

    public Order updateOrder(UUID orderId, List<OrderItem> items) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order not found"));
        order.setItems(items);
        return orderRepository.save(order);
    }

    public void cancelOrder(UUID orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order not found"));
        order.setStatus("CANCELLED");
        orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}