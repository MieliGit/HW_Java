package org.example.HW_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ItemsTask_2 item1 = new ItemsTask_2("Столик книжный", 1599.99, "Россия", 22.1, 1);
        ItemsTask_2 item2 = new ItemsTask_2("Вешалка для одежды", 859.99, "Китай", 11.3, 2);
        ItemsTask_2 item3 = new ItemsTask_2("Светильник", 499.99, "Китай", 3.1, 1);
        ItemsTask_2 item4 = new ItemsTask_2("Носки спортивный", 1010.69, "Америка", 1.2, 3);
        ItemsTask_2 item5 = new ItemsTask_2("Каска строительная", 679.99, "Россия", 2.3, 2);
        ItemsTask_2 item6 = new ItemsTask_2("Тумбочка", 2401.99, "Германия", 15.1, 3);
        ItemsTask_2 item7 = new ItemsTask_2("Книга", 467.99, "Россия", 2.1, 1);

        List<ItemsTask_2> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);

        System.out.println("itemList = " + itemList);
        System.out.println();

        Scanner gr = new Scanner(System.in);
        System.out.println("Какой сорт вас интересует от 1 до 3: ");
        int grValue = gr.nextInt();

        Double minP = itemList.get(0).getPrice();
        String minName = "";

        for (ItemsTask_2 items : itemList) {
            if (items.getGrade() == grValue) {
                if (minP > items.getPrice()) {
                    minP = items.getPrice();
                }
            }
        }
        for (ItemsTask_2 items : itemList) {
            if (items.getGrade() == grValue) {
                if (Objects.equals(items.getPrice(), minP)) {
                    minName += items.getName() + "\n";
                }
            }
        }
        System.out.println("Самый дешевый товары из выбранного сорта: " + minName + "Его цена составляет: " + minP);
    }
}