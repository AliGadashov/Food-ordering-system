package org.gadashov.order.service.domain.ports.output.message.publisher.payment;

import org.gadashov.domain.event.publisher.DomainEventPublisher;
import org.gadashov.order.service.domain.event.OrderCancelledEvent;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:15 AM
 */

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
