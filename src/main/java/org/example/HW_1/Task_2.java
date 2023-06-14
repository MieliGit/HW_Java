package org.example.HW_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Ввод элементов:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print ("Вывод:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + arr[i]);
        }
        System.out.println();
        int sum = 0;

        sumNumber(sum, size, arr);

    }

    private static int sumNumber(int sum, int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                sum += arr[i - 1];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
