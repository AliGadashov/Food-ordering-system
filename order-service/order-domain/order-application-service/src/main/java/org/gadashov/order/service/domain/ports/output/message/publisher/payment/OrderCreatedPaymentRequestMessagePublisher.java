package org.gadashov.order.service.domain.ports.output.message.publisher.payment;

import org.gadashov.domain.event.publisher.DomainEventPublisher;
import org.gadashov.order.service.domain.event.OrderCreatedEvent;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:14 AM
 */

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
