package org.example;

import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Длина строки: ");
        int size = input.nextInt();
        String array[] = new String[size+1];
        System.out.println("Введите слова по очереди:");
        for (int i = 0; i <= size; i++) {
            array[i] = input.nextLine();
        }

        System.out.print ("Обычный вид:");
        for (int i = 0; i <= size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();

        System.out.print ("Первернутый вид:");
        for (int i = size; i > 0; i--) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
