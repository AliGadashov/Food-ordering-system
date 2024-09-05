package org.gadashov.order.service.domain.ports.output.message.publisher.restaurantapproval;

import org.gadashov.domain.event.publisher.DomainEventPublisher;
import org.gadashov.order.service.domain.event.OrderPaidEvent;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:18 AM
 */

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
