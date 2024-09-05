package org.gadashov.order.service.domain.valueObject;

import org.gadashov.domain.valueObject.BaseId;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 10:32 PM
 */

public class OrderItemId extends BaseId<Long> {

    public OrderItemId(Long value) {
        super(value);
    }
}
