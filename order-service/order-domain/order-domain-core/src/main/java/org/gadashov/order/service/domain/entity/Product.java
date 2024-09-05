package org.gadashov.order.service.domain.entity;

import org.gadashov.domain.entity.BaseEntity;
import org.gadashov.domain.valueObject.Money;
import org.gadashov.domain.valueObject.ProductId;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 10:34 PM
 */

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price){
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public Product(ProductId productId) {
        super.setId(productId);
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
