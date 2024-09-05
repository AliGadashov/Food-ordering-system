package org.gadashov.order.service.domain.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.gadashov.domain.valueObject.PaymentStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 1:51 AM
 */
@Getter
@Builder
@AllArgsConstructor
public class PaymentResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String paymentId;
    private String customerId;
    private BigDecimal price;
    private Instant createdAt;
    private PaymentStatus paymentStatus;
    private List<String> failureMessages;

}
