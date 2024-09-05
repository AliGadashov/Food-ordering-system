package org.gadashov.order.service.domain.event;

import org.gadashov.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 11:29 PM
 */

public class OrderCancelledEvent extends OrderEvent  {
    public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
