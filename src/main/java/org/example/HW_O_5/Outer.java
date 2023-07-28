package org.example.HW_O_5;

import org.example.HW_O_5.controller.ControllerS;
import org.example.HW_O_5.controller.ControllerT;

import java.util.Scanner;

public class Outer {

    public static void main(String[] args) {
        ControllerS controllers = new ControllerS();
        ControllerT controllert = new ControllerT();

        System.out.println("Выбрать действие:\n" +
                "1 - Показать список учеников\n" +
                "2 - Показать список учителей");
        System.out.println();
        System.out.print("Ваше число: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n == 1){
            controllers.createStuden("Даниил","Захаров","Борисович");
            controllers.createStuden("Александор","Петрушкин","Николаевич");
            controllers.createStuden("Анна","Апельсинова","Константиновна");
            controllers.getAllStudent();
        }if (n == 2){
            controllert.createTeacher("Светланна","Шишкина","Сергеевна");
            controllert.createTeacher("Николай","Кукушкин","Викторович");
            controllert.createTeacher("Ирина","Лирикова","Борисовна");
            controllert.getAllTeacher();
        }
    }

}
