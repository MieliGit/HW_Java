package org.example.HW_02;

import java.util.Scanner;

public class TAsk_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String inputData = null;
        while (!valid) {
            System.out.print("Введите текст: \t");
            try {
                inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    valid = true;
                } else {
                    System.out.println("Пустая строка, попробуйте еще раз");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        }
        System.out.println("Вывод: " + inputData);
    }
}
