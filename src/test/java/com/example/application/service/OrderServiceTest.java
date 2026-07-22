package com.example.application.service;

import com.example.domain.model.Order;
import com.example.domain.model.OrderItem;
import com.example.infrastructure.persistence.OrderRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.List;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @MockBean
    private OrderRepository orderRepository;

    @Test
    public void testCreateOrder() {
        UUID orderId = UUID.randomUUID();
        String customerId = "customer1";
        List<OrderItem> items = List.of(new OrderItem(UUID.randomUUID(), "product1", 1));

        Mockito.when(orderRepository.save(any(Order.class))).thenReturn(new Order(orderId, customerId, "CREATED", items));

        Order createdOrder = orderService.createOrder(customerId, items);

        assertNotNull(createdOrder);
        assertEquals(orderId, createdOrder.getId());
        assertEquals(customerId, createdOrder.getCustomerId());
        assertEquals("CREATED", createdOrder.getStatus());
        assertEquals(items, createdOrder.getItems());
    }
}