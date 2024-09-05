package org.gadashov.order.service.domain.event;

import org.gadashov.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 11:28 PM
 */

public class OrderPaidEvent extends OrderEvent {
    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
