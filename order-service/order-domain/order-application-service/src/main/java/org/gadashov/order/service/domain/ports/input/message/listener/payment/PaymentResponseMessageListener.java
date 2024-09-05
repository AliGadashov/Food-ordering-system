package org.gadashov.order.service.domain.ports.input.message.listener.payment;

import org.gadashov.order.service.domain.dto.message.PaymentResponse;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:04 AM
 */

public interface PaymentResponseMessageListener {
    void paymentCompleted(PaymentResponse paymentResponse);
    void paymentCancelled(PaymentResponse paymentResponse);
}
