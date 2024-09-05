package org.gadashov.order.service.domain;

import lombok.extern.slf4j.Slf4j;
import org.gadashov.order.service.domain.dto.create.CreateOrderCommand;
import org.gadashov.order.service.domain.dto.create.CreateOrderResponse;
import org.gadashov.order.service.domain.dto.track.TrackOrderQuery;
import org.gadashov.order.service.domain.dto.track.TrackOrderResponse;
import org.gadashov.order.service.domain.ports.input.service.OrderApplicationService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 5:02 PM
 */
@Slf4j
@Validated
@Service
class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderCreateCommandHandler orderCreateCommandHandler;
    private final OrderTrackCommandHandler orderTrackCommandHandler;

    OrderApplicationServiceImpl(OrderCreateCommandHandler orderCreateCommandHandler, OrderTrackCommandHandler orderTrackCommandHandler) {
        this.orderCreateCommandHandler = orderCreateCommandHandler;
        this.orderTrackCommandHandler = orderTrackCommandHandler;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        return orderCreateCommandHandler.createOrderResponse(createOrderCommand);
    }

    @Override
    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {

        return orderTrackCommandHandler.trackOrderResponse(trackOrderQuery);
    }
}
