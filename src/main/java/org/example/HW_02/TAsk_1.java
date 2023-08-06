package org.example.HW_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TAsk_1 {
    public static void main(String[] args) {
        boolean fn = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(fn){
            System.out.print("Введите дробное число: ");
            try{
                float n = Float.parseFloat(reader.readLine());
                System.out.printf("Число: %f\n", n);
                fn = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод, повторите");
            }

        }
    }
}
