package org.gadashov.order.service.domain.ports.input.message.listener.restaurantapproval;

import org.gadashov.order.service.domain.dto.message.RestaurantApprovalResponse;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:05 AM
 */

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);
    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
