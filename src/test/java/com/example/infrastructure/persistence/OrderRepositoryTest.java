package com.example.infrastructure.persistence;

import com.example.domain.model.Order;
import com.example.domain.model.OrderItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import java.util.List;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class OrderRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testSaveAndFindOrder() {
        UUID orderId = UUID.randomUUID();
        String customerId = "customer1";
        List<OrderItem> items = List.of(new OrderItem(UUID.randomUUID(), "product1", 1));
        Order order = new Order(orderId, customerId, "CREATED", items);

        entityManager.persist(order);
        entityManager.flush();

        Order foundOrder = orderRepository.findById(orderId).orElse(null);

        assertNotNull(foundOrder);
        assertEquals(orderId, foundOrder.getId());
        assertEquals(customerId, foundOrder.getCustomerId());
        assertEquals("CREATED", foundOrder.getStatus());
        assertEquals(items, foundOrder.getItems());
    }
}