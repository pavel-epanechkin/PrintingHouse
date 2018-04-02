package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Order {

    @Getter @Setter
    private boolean isPaid;

    @Getter @Setter
    private OrderStatus status;

    @Getter
    private String address;

    @Getter
    private ArrayList<OrderPosition> positions;

    public Order(boolean isPaid, OrderStatus status, String address, ArrayList<OrderPosition> positions) {
        this.isPaid = isPaid;
        this.status = status;
        this.address = address;
        this.positions = positions;
    }

    public double CalculateTotalCost(){
        double result = 0;
        for (int i = 0; i < positions.size(); i++)
            result += positions.get(i).GetCost();
        return result;
    }

}
