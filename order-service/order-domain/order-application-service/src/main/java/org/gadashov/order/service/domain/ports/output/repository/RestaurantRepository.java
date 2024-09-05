package org.gadashov.order.service.domain.ports.output.repository;

import org.gadashov.domain.valueObject.RestaurantId;
import org.gadashov.order.service.domain.entity.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 2:09 AM
 */

public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
