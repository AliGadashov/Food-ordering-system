package org.gadashov.domain.valueObject;

import java.util.UUID;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 10:20 PM
 */

public class CustomerId extends BaseId<UUID>{
    public CustomerId(UUID value) {
        super(value);
    }
}
