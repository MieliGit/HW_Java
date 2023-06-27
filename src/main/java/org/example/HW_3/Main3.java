package org.example.HW_3;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main3 {
    public static void main(String[] args) {
        ItemsTask_3 item1 = new ItemsTask_3("Оруэлл", "1984", 499.59, 2021, 319);
        ItemsTask_3 item2 = new ItemsTask_3("Кафка", "Процесс", 399.59, 2023, 199);
        ItemsTask_3 item3 = new ItemsTask_3("Кинг", "Кладбище домашних животных", 799.59, 1983, 373);
        ItemsTask_3 item4 = new ItemsTask_3("Гаррисон", "Неукратимая планета", 299.19, 1991, 509);
        ItemsTask_3 item5 = new ItemsTask_3("Кристи", "Убийство в «Восточном экспрессе»", 499.59, 1934, 320);
        ItemsTask_3 item6 = new ItemsTask_3("Лавкрафт", "Хребты безумия", 569.99, 1936, 352);
        ItemsTask_3 item7 = new ItemsTask_3("Дуглас", "Автостопом по галактике", 709.59, 2011, 352);



        List<ItemsTask_3> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);

        System.out.println("itemList = " + itemList);
        System.out.println();


        Double minP = itemList.get(0).getPrice();
        String NameBook = "";

        StringBuilder sortedItems = new StringBuilder();

        for (ItemsTask_3 items : itemList) {
            if (isPrime(items.getPage()) && items.getSurname().toLowerCase().contains("а")) {
                if (items.getYear() >= 2010 && items.getYear() <= 2023) {
                    sortedItems.append(items.getNameBook()).append("\n");
                }
            }
        }
        System.out.println(sortedItems);
    }
    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

