package pro.xway.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
public class ConverterController {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
