package org.example.HW_2;

import java.util.Scanner;

public class Task_1 {
    public static void  main (String args[]) {
        Scanner input = new Scanner(System.in);
        int count = 10;
        int sum = 1;
        int n = 1;
        for (int i = 0; i < count; i++) {
            if (n == 2) {
                sum += n;
                n++;
            } else {
                while (!isPrime(n)) {
                    n = n + 2;
                }
                sum += n;
                n = n + 2;
                System.out.println(n);
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        } else {
            if (n % 2 == 0) return false;
            for (int j = 3; j <= (n / 2) + 1; j = j + 2) {
                if (n % j == 0) return false;
            }
            return true;
        }
    }

}

