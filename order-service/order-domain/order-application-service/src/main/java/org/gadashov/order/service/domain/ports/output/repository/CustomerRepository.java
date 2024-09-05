package org.gadashov.order.service.domain.ports.output.repository;

import org.gadashov.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:10 AM
 */

public interface CustomerRepository {
    Optional<Customer> findCustomer(UUID customerId);
}
