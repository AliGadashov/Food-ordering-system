package org.gadashov.order.service.domain.mapper;

import org.gadashov.domain.valueObject.CustomerId;
import org.gadashov.domain.valueObject.Money;
import org.gadashov.domain.valueObject.ProductId;
import org.gadashov.domain.valueObject.RestaurantId;
import org.gadashov.order.service.domain.dto.create.CreateOrderCommand;
import org.gadashov.order.service.domain.dto.create.CreateOrderResponse;
import org.gadashov.order.service.domain.dto.create.OrderAddress;
import org.gadashov.order.service.domain.entity.Order;
import org.gadashov.order.service.domain.entity.OrderItem;
import org.gadashov.order.service.domain.entity.Product;
import org.gadashov.order.service.domain.entity.Restaurant;
import org.gadashov.order.service.domain.valueObject.StreetAddress;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 1:58 AM
 */
@Component
public class OrderDataMapper {
    public Restaurant createOrderCommandToRestaurant(CreateOrderCommand createOrderCommand){
        return Restaurant.Builder.builder()
                .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
                .products(createOrderCommand.getItems().stream().map(orderItem ->
                        new Product(new ProductId(orderItem.getProductId())))
                        .collect(Collectors.toList()))
                .build();
    }

    public Order createOrderCommandToOrder(CreateOrderCommand createOrderCommand){
        return Order.Builder.builder()
                .customerId(new CustomerId(createOrderCommand.getCustomerId()))
                .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
                .deliveryAddress(orderAddressToStreetAddress(createOrderCommand.getAddress()))
                .price(new Money(createOrderCommand.getPrice()))
                .items(orderItemsToOrderItemEntities(createOrderCommand.getItems()))
                .build();
    }

    public CreateOrderResponse orderToCreateOrderResponse(Order order){
        return CreateOrderResponse.builder()
                .orderTrackingId(order.getTrackingId().getValue())
                .orderStatus(order.getOrderStatus())
                .build();
    }
    private List<OrderItem> orderItemsToOrderItemEntities(
            List<org.gadashov.order.service.domain.dto.create.OrderItem> orderItems) {
        return orderItems.stream()
                .map(orderItem ->
                        OrderItem.Builder.builder()
                                .product(new Product(new ProductId(orderItem.getProductId())))
                                .price(new Money(orderItem.getPrice()))
                                .quantity(orderItem.getQuantity())
                                .subTotal(new Money(orderItem.getSubTotal()))
                                .build())
                .collect(Collectors.toList());
    }

    private StreetAddress orderAddressToStreetAddress(OrderAddress orderAddress) {
        return new StreetAddress(
                UUID.randomUUID(),
                orderAddress.getStreet(),
                orderAddress.getPostalCode(),
                orderAddress.getCity()
        );
    }


}
