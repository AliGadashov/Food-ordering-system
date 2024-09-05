package org.gadashov.domain.event.publisher;

import org.gadashov.domain.event.DomainEvent;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:13 AM
 */

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
