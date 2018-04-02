package domain;

import lombok.Getter;

public abstract class Staff extends User {

    @Getter
    String firstName;

    @Getter
    String lastName;

    public Staff(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
