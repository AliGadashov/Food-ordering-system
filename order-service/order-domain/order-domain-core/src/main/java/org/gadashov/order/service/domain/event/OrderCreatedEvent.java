package org.gadashov.order.service.domain.event;

import org.gadashov.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 11:26 PM
 */

public class OrderCreatedEvent extends OrderEvent {
    public OrderCreatedEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
