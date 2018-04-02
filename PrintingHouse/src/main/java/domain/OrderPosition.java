package domain;


import lombok.Getter;
import lombok.Setter;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;


public class OrderPosition {

    @Getter
    private int posNumber;

    @Getter
    private Product product;

    @Getter
    private int copiesCount;

    @Getter @Setter
    private PositionStatus status;

    private InputStream templateFile;

    @Getter
    private int paidCost;

    public OrderPosition(int posNumber, Product product, int copiesCount, PositionStatus status, InputStream templateFile, int paidCost) {
        this.posNumber = posNumber;
        this.product = product;
        this.copiesCount = copiesCount;
        this.status = status;
        this.templateFile = templateFile;
        this.paidCost = paidCost;
    }

    public double GetCost() {
        if (paidCost != 0)
            return paidCost;
        return product.getCost() * copiesCount;
    }

    public HashMap<Consumable, Double> GetConsumablesRequirements() {
        HashMap<Consumable, Double> result = new HashMap<Consumable, Double>();
        List<ProductRequirement> requirements = product.getConsumables();
        for (int i = 0; i < requirements.size(); i++){
            ProductRequirement req = requirements.get(i);
            Consumable consumable = req.getConsumable();
            double consumablesReqs = req.getConsumablesCount() * copiesCount;
            double newVal = result.get(consumable).doubleValue() + consumablesReqs;
            result.put(consumable, newVal);
        }
        return result;
    }

}
