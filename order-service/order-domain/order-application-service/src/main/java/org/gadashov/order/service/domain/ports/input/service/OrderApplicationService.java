package org.gadashov.order.service.domain.ports.input.service;

import jakarta.validation.Valid;
import org.gadashov.order.service.domain.dto.create.CreateOrderCommand;
import org.gadashov.order.service.domain.dto.create.CreateOrderResponse;
import org.gadashov.order.service.domain.dto.track.TrackOrderQuery;
import org.gadashov.order.service.domain.dto.track.TrackOrderResponse;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:00 AM
 */

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);
    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
