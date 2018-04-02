package domain;

import lombok.Getter;

import java.util.List;

public class Product {

    @Getter
    private String name;

    @Getter
    private double cost;

    @Getter
    private List<ProductRequirement> consumables;

    public Product(String name, double cost, List<ProductRequirement> consumables) {
        this.name = name;
        this.cost = cost;
        this.consumables = consumables;
    }
}
