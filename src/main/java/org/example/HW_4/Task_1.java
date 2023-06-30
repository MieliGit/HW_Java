package org.example.HW_4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> numList = new LinkedList<>();
        System.out.print("Ввводите размер списка: ");
        Scanner num  =  new Scanner(System.in);
        int n =  num.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numList.add(random.nextInt(10));
        }
        System.out.println("numList = " + numList);
        num.close();

        System.out.print("Обратный numList: ");
        while (numList.size() > 0) {
            System.out.print(numList.pollLast() + " ");
        }
    }
}
