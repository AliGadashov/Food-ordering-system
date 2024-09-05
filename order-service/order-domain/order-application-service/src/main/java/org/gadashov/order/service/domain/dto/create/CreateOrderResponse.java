package org.gadashov.order.service.domain.dto.create;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.gadashov.domain.valueObject.OrderStatus;

import java.util.UUID;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 1:46 AM
 */
@Getter
@Builder
@AllArgsConstructor
public class CreateOrderResponse {
    @NotNull
    private final UUID orderTrackingId;
    @NotNull
    private final OrderStatus orderStatus;
    @NotNull
    private final String message;
}
