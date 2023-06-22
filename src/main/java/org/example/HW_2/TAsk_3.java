package org.example.HW_2;

import java.util.Scanner;

public class TAsk_3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Длина массива: ");
            int size = input.nextInt();
            int arr[] = new int[size];
            System.out.println("Ввод элементов:");
            int sum = 0;


            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            System.out.print("Вывод:");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + arr[i]);
                if (arr[i] > 9 && arr[i] < 100) {
                    sum += i;
                }
            }
            System.out.println();
            System.out.print("Вывод с заменой:");
            for (int i = 0; i < size; i++) {
                if (arr[i] < 0) {
                    arr[i] = sum;
                }
                System.out.print(" " + arr[i]);
            }
        }
    }


