package org.example.HW_2;

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
        int a = 1;
        for (int i = 0; i < size-1; i++) {
            if (arr[i] > arr[i + 1]){
                System.out.println();
                System.out.println("Не является возрастающей");
                a++;
                break;
            }


            else{
                a++;
                if(a == size) {
                    System.out.println();
                    System.out.println("Является возрастающей");
                }
            }

        }
    }
}
