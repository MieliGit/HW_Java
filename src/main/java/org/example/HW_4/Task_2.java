package org.example.HW_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность скобок");
        String st = sc.nextLine();
        sc.close();
        System.out.println(Soluthion(st));
    }

    private static boolean Soluthion(String st) {
        Deque<Character> c = new LinkedList<>();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '(' || st.charAt(i) == '{' || st.charAt(i) == '[')
                c.add(st.charAt(i));
            else {
                if (c.isEmpty())
                    return false;
                else if (st.charAt(i) == ')' && c.getLast().equals('('))
                    c.pollLast();
                else if (st.charAt(i) == '}' && c.getLast().equals('{'))
                    c.pollLast();
                else if (st.charAt(i) == ']' && c.getLast().equals('['))
                    c.pollLast();
                else
                    return false;
            }
        }
        return c.isEmpty();


    }


}




