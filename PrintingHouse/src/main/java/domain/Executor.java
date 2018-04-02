package domain;

import lombok.Getter;

public class Executor extends Staff {

    @Getter
    String specialization;

    public Executor(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
