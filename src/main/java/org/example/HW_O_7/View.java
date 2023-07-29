package org.example.HW_O_7;

import java.util.Scanner;

public class View {

    private ProcessInter calculableFactory;

    public View(ProcessInter calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            Teams calculator = calculableFactory.create(primaryArg, true);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, -) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
                if (cmd.equals("-")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.dif(arg);
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.div(arg);
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Если хотите продолжить, напишите 'Y', а для выхода 'N':  ");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}