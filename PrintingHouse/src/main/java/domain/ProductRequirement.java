package domain;

import lombok.Getter;

public class ProductRequirement {

    @Getter
    private Consumable consumable;

    @Getter
    private double consumablesCount;

    public ProductRequirement(Consumable consumable, int consumablesCount) {
        this.consumable = consumable;
        this.consumablesCount = consumablesCount;
    }
}
