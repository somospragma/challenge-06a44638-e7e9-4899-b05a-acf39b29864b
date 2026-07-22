package com.example.domain.model;

import java.util.UUID;

public class OrderItem {
    private UUID id;
    private String productId;
    private int quantity;

    public OrderItem(UUID id, String productId, int quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}