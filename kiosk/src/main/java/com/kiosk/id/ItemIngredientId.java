package com.kiosk.id;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ItemIngredientId implements Serializable {
    private Long itemId;
    private Long ingredientId;

    // equals & hashCode (nutné pro EmbeddedId)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemIngredientId)) return false;
        ItemIngredientId that = (ItemIngredientId) o;
        return Objects.equals(itemId, that.itemId) &&
                Objects.equals(ingredientId, that.ingredientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, ingredientId);
    }
}
