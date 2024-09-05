package org.gadashov.domain.entity;

import java.util.Objects;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 9:58 PM
 */

public abstract class BaseEntity<ID> {

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
