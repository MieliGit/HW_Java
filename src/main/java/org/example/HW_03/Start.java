package org.example.HW_03;
import java.io.IOException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserReader inputReader = new UserInput(scanner);
        IntFile fileWriter = new FileAdd();

        try {
            User userData = inputReader.readUserData();
            fileWriter.writeUserData(userData);
        } catch (UserErrorCheck | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
