package OOP.HW_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс автомата горячих напитков
 */
public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();
    @Override
    public void initProduct() {
    }
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }
    @Override
    public String getProduct() {
        return null;
    }
    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }

    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }

    public String getProduct(int temp) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}