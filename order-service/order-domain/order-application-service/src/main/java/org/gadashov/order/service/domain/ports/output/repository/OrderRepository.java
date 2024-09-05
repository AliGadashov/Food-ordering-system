package org.gadashov.order.service.domain.ports.output.repository;

import org.gadashov.order.service.domain.entity.Order;
import org.gadashov.order.service.domain.valueObject.TrackingId;

import java.util.Optional;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:07 AM
 */

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findByTrackingId(TrackingId trackingId);
}
