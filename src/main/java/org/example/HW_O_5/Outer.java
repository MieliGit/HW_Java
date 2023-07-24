package org.example.HW_O_5;

import org.example.HW_O_5.controller.Controller;

import java.util.Scanner;

public class Outer {

    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Выбрать действие:\n" +
                "1 - Показать список учеников\n" +
                "2 - Показать список учителей");
        System.out.println();
        System.out.print("Ваше число: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n == 1){
            controller.createStuden("Даниил","Захаров","Борисович");
            controller.createStuden("Александор","Петрушкин","Николаевич");
            controller.createStuden("Анна","Апельсинова","Константиновна");
            controller.getAllStudent();
        }if (n == 2){
            controller.createTeacher("Светланна","Шишкина","Сергеевна");
            controller.createTeacher("Николай","Кукушкин","Викторович");
            controller.createTeacher("Ирина","Лирикова","Борисовна");
            controller.getAllTeacher();
        }
    }

}
