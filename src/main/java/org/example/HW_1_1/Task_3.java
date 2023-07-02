package org.example.HW_1_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Введите число первое: ");
        Scanner num1  =  new Scanner(System.in);
        int n1 =  num1.nextInt();

        System.out.print("Введите число второе: ");
        Scanner num2  =  new Scanner(System.in);
        int n2 =  num2.nextInt();


        System.out.print("Введите действие: ");
        Scanner chr  =  new Scanner(System.in);
        char c =  chr.next().charAt(0);

        int res = 0;
        String st = "";

        switch (c){
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            default:
                st = "Ошибка ввода";
                break;
        }

        if(st == "Ошибка ввода"){
            System.out.println(st);
        }
        else {
            System.out.println("Результат: " + n1 + c + n2 + "=" + res);
        }


    }
}
