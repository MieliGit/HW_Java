package org.example.HW_O_3;

import org.example.HW_2_2.Task_1;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(AbstractGame.class.getName());
        log.setLevel(Level.INFO);
        FileHandler ch = new FileHandler("log3.txt");
        log.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);



        System.out.println("Выберите тип игры \n" +
                "1 - Игра с числами\n" +
                "2 - Игра с русскими словами\n" +
                "3 - Игра с английскими словами\n");
        System.out.println();

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n == 1){
            NumberGame numberGame = new NumberGame();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите рвзмер числа и колличество попытоку: ");
            numberGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!numberGame.getGameStatus().equals(GameStatus.FINISH)){
                String value = scanner.nextLine();
                Answer answer = numberGame.inputValue(value);
                if(answer!=null){
                    System.out.println("answer = " + answer);
                }
                log.info(value);
            }
        }if (n == 2) {
            RuGame ruGame = new RuGame();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите рвзмер слова и колличество попытоку: ");
            ruGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!ruGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = ruGame.inputValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                }
                log.info(value);
            }
        }if (n == 3) {
                EnGame enGame = new EnGame();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите рвзмер слова и колличество попытоку: ");
                enGame.start(scanner.nextInt(), scanner.nextInt());
                scanner.nextLine();
                while (!enGame.getGameStatus().equals(GameStatus.FINISH)) {
                    String value = scanner.nextLine();
                    Answer answer = enGame.inputValue(value);
                    if (answer != null) {
                        System.out.println("answer = " + answer);
                    }
                    log.info(value);
                }
        }
    }
}

