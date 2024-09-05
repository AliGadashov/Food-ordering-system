package org.gadashov.order.service.domain.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.gadashov.domain.valueObject.OrderApprovalStatus;

import java.time.Instant;
import java.util.List;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 1:55 AM
 */
@Getter
@Builder
@AllArgsConstructor
public class RestaurantApprovalResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String restaurantId;
    private Instant createdAt;
    private OrderApprovalStatus orderApprovalStatus;
    private List<String> failureMessages;
}
