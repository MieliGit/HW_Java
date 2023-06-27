package org.example.HW_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main1 {
    public static void main(String[] args) {
        ItemsTask_1 item1 = new ItemsTask_1("Свинина тушеная высший сорт", 702.99, 1);
        ItemsTask_1 item2 = new ItemsTask_1("Соль крупная для засолки", 217.99, 2);
        ItemsTask_1 item3 = new ItemsTask_1("Мука Макфа Пшеничная высший сорт, полипропиленовый мешок", 159.59, 1);
        ItemsTask_1 item4 = new ItemsTask_1("Горошек зеленый Кормилица высший сорт", 62.29, 2);
        ItemsTask_1 item5 = new ItemsTask_1("Сахар Русский", 70.19, 1);
        ItemsTask_1 item6 = new ItemsTask_1("Аривера Крупа пшеница", 59.99, 3);
        ItemsTask_1 item7 = new ItemsTask_1("Рис Мистраль", 112.99, 2);

        List<ItemsTask_1> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);

        System.out.println("itemList = " + itemList);
        System.out.println();

        String searchName = "высший";
        Double maxP = 0.0;
        String maxName = "";

        for (ItemsTask_1 items : itemList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getGrade() == 1 || items.getGrade() == 2)) {
                if (maxP < items.getPrice()) {
                    maxP = items.getPrice();
                }
            }
        }

        for (ItemsTask_1 items : itemList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getGrade() == 1 || items.getGrade() == 2)) {
                if (Objects.equals(items.getPrice(), maxP)) {
                    maxName += items.getName() + "\n";
                }
            }
        }
        System.out.println("Самый дорогой товары из типа высший: " + maxName + "Его цена составляет: " + maxP);
    }
}