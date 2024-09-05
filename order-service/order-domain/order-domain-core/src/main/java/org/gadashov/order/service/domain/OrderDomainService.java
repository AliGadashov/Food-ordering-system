package org.gadashov.order.service.domain;

import org.gadashov.order.service.domain.entity.Order;
import org.gadashov.order.service.domain.entity.Restaurant;
import org.gadashov.order.service.domain.event.OrderCancelledEvent;
import org.gadashov.order.service.domain.event.OrderCreatedEvent;
import org.gadashov.order.service.domain.event.OrderPaidEvent;

import java.util.List;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 11:33 PM
 */

public interface OrderDomainService {
    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);
    OrderPaidEvent payOrder(Order order);
    void approveOrder(Order order);
    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);
    void cancelOrder(Order order, List<String> failureMessages);
}
