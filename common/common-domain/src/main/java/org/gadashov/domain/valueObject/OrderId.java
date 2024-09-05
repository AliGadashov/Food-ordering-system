package org.gadashov.domain.valueObject;

import java.util.UUID;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 10:05 PM
 */

public class OrderId extends BaseId<UUID>{

    public OrderId(UUID value) {
        super(value);
    }

}
