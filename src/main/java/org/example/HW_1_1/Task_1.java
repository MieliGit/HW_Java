package org.example.HW_1_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner num  =  new Scanner(System.in);
        int n =  num.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("n-ое треугольного число: " + sum);
    }
}
