package pro.xway.controller;


import pro.xway.model.Price;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class IndexController {
    private List<Price> priceList = new ArrayList<>();


    public List<String> loadNavigation(){
        List<String> list = new ArrayList<>();
        list.add("Главная");
        list.add("Категории");
        list.add("Товары");
        list.add("Заказы");
        return list;
    }

    public IndexController() {
    }

    @PostConstruct
    public void loadPrice(){
        priceList.add(new Price("potato", 310));
        priceList.add(new Price("morko", 210));
    }

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }
}
