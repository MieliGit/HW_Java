package org.example.HW_1_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner num  =  new Scanner(System.in);
        int n =  num.nextInt();
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= n; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println("n-ое треугольного число: " + sum);
        System.out.println("Произведение числе от 1 до n: " + mul);
    }
}
