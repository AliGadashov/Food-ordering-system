package org.gadashov.order.service.domain.dto.create;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 1:44 AM
 */
@Getter
@Builder
@AllArgsConstructor
public class OrderAddress {
    @NotNull
    @Max(value = 50)
    private final String street;
    @NotNull
    @Max(value = 10)
    private final String postalCode;
    @NotNull
    @Max(value = 50)
    private final String city;
}
