package com.example.domain.model;

import org.junit.jupiter.api.Test;
import java.util.UUID;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testOrderCreation() {
        UUID id = UUID.randomUUID();
        String customerId = "customer1";
        String status = "CREATED";
        List<OrderItem> items = List.of(new OrderItem(UUID.randomUUID(), "product1", 1));

        Order order = new Order(id, customerId, status, items);

        assertEquals(id, order.getId());
        assertEquals(customerId, order.getCustomerId());
        assertEquals(status, order.getStatus());
        assertEquals(items, order.getItems());
    }
}