package org.example.HW_1_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner num  =  new Scanner(System.in);
        int count =  num.nextInt();
        int n = 1;
        for (int i = 0; i < count; i++) {
            if (n == 2) {
                n++;
            } else {
                while (!isPrime(n)) {
                    n = n + 2;
                }
                n = n + 2;
                System.out.println(n);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        } else {
            if (n % 2 == 0 && n % 5 == 0) return false;
            for (int j = 3; j <= (n / 2) + 1; j = j + 2) {
                if (n % j == 0) return false;
            }
            return true;
        }
    }
}
