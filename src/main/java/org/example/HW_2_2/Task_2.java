package org.example.HW_2_2;

import lombok.SneakyThrows;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Task_2 {
    @SneakyThrows
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler fh = new FileHandler("log2.txt");
        logger.addHandler(fh);
        logger.info("Sort Array");

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
