package org.gadashov.order.service.domain.valueObject;

import org.gadashov.domain.valueObject.BaseId;

import java.util.UUID;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 10:48 PM
 */

public class TrackingId extends BaseId<UUID> {

    public TrackingId(UUID value) {
        super(value);
    }
}
