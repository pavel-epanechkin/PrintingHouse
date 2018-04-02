package domain;

import lombok.Getter;

public class Consumable {

    @Getter
    private String name;

    @Getter
    private String unitsType;

    public Consumable(String name, String unitsType){
        this.name = name;
        this.unitsType = unitsType;
    }
}
