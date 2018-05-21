package pro.xway.model;

import javax.inject.Named;

@Named
public class Contract {
    private String name;

    public Contract(String name) {
        this.name = name;
    }

    public Contract() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
