package org.gadashov.order.service.domain;

import lombok.extern.slf4j.Slf4j;
import org.gadashov.domain.valueObject.RestaurantId;
import org.gadashov.order.service.domain.dto.create.CreateOrderCommand;
import org.gadashov.order.service.domain.dto.create.CreateOrderResponse;
import org.gadashov.order.service.domain.entity.Customer;
import org.gadashov.order.service.domain.entity.Order;
import org.gadashov.order.service.domain.entity.Restaurant;
import org.gadashov.order.service.domain.event.OrderCreatedEvent;
import org.gadashov.order.service.domain.exception.OrderDomainException;
import org.gadashov.order.service.domain.mapper.OrderDataMapper;
import org.gadashov.order.service.domain.ports.output.repository.CustomerRepository;
import org.gadashov.order.service.domain.ports.output.repository.OrderRepository;
import org.gadashov.order.service.domain.ports.output.repository.RestaurantRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/5/2024
 * Time: 5:04 PM
 */
@Slf4j
@Component
public class OrderCreateCommandHandler {
    private final OrderDomainService orderDomainService;
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final RestaurantRepository restaurantRepository;
    private final OrderDataMapper orderDataMapper;

    public OrderCreateCommandHandler(OrderDomainService orderDomainService,
                                     OrderRepository orderRepository,
                                     CustomerRepository customerRepository,
                                     RestaurantRepository restaurantRepository,
                                     OrderDataMapper orderDataMapper) {
        this.orderDomainService = orderDomainService;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.restaurantRepository = restaurantRepository;
        this.orderDataMapper = orderDataMapper;
    }
    @Transactional
    public CreateOrderResponse createOrderResponse(CreateOrderCommand createOrderCommand) {
        checkCustomer(createOrderCommand.getCustomerId());
        Restaurant restaurant = checkRestaurant(createOrderCommand);
        Order order = orderDataMapper.createOrderCommandToOrder(createOrderCommand);
        OrderCreatedEvent orderCreatedEvent = orderDomainService.validateAndInitiateOrder(order, restaurant);
        Order orderResult = saveOrder(order);
        log.info("Order is created with id: {}",orderResult.getId().getValue());
        return orderDataMapper.orderToCreateOrderResponse(orderResult);
    }

    private Restaurant checkRestaurant(CreateOrderCommand createOrderCommand) {
        Restaurant restaurant = orderDataMapper.createOrderCommandToRestaurant(createOrderCommand);
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findRestaurantInformation(restaurant);
        if (optionalRestaurant.isEmpty()){
            log.warn("Could not find restaurant with restaurant id: {}",createOrderCommand.getRestaurantId());
            throw new OrderDomainException("Could not find restaurant with restaurant id: " +
                    createOrderCommand.getRestaurantId());
        }
        return optionalRestaurant.get();
    }

    private void checkCustomer(UUID customerId) {
        Optional<Customer> customer = customerRepository.findCustomer(customerId);
        if (customer.isEmpty()){
            log.warn("Could not find customer with customer id: {}",customerId);
            throw new OrderDomainException("Could not find customer with customer id: " + customer);
        }
    }
    private Order saveOrder(Order order){
        Order orderResult = orderRepository.save(order);
        log.error("Could not save order!");
        if (orderResult == null){
            throw new OrderDomainException("Could not save order!");
        }
        log.info("Order is saved with id: {}", orderResult.getId().getValue());
        return orderResult;
    }
}
