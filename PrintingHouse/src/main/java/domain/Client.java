package domain;

import lombok.Getter;

public class Client extends User {

    @Getter
    private String contactName;

    @Getter
    private String contactPhone;

    public Client(int id, String contactName, String contactPhone) {
        this.id = id;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }
}
