package org.example.HW_03;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileAdd implements IntFile {

    @Override
    public void writeUserData(User userData) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Название файла: ");
        String fileName = scanner.nextLine();
        FileWriter writer = new FileWriter(fileName, true);
        String userDataString = String.join(" ",
                userData.getLastName(),
                userData.getFirstName(),
                userData.getMiddleName(),
                userData.getBirthday().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                String.valueOf(userData.getPhone()),
                userData.getGender().toString());
        writer.write(userDataString + "\n");
        writer.close();
        System.out.println("Данные зафиксированы: " +
                fileName);
    }
}