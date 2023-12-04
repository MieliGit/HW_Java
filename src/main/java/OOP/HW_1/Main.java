package OOP.HW_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hot Drinkables Search");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrinks("Mulled wine", new BigDecimal(1), 0.4, 50),
                new HotDrinks("Hot chocolate", new BigDecimal(3), 1.0, 70)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

}