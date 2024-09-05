package org.gadashov.order.service.domain.exception;

import org.gadashov.domain.exception.DomainException;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 11:10 PM
 */

public class OrderDomainException extends DomainException {

    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable casue) {
        super(message, casue);
    }
}
