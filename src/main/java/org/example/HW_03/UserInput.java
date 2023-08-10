package org.example.HW_03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput implements UserReader {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public User readUserData() throws UserErrorCheck {
        while (true) {
            System.out.println("Введите данные, разделяя их пробелом: Фамилия\n" +
                    " Имя\n" +
                    " Отчество\n" +
                    " Дата рождения (dd.mm.yyyy)\n" +
                    " Номер телефона\n" +
                    " Пол (f или m)\n");


            try {
                String input = scanner.nextLine();
                String[] data = input.split(" ");

                if (data.length != 6) {
                    throw new UserErrorCheck("Введено неверное количество данных");
                }

                LocalDate dateOfBirth = parseDateOfBirth(data[3]);
                long phoneNumber = parsePhoneNumber(data[4]);
                Gender gender = parseGender(data[5]);

                return new User(data[0], data[1], data[2], dateOfBirth, phoneNumber, gender);
            } catch (ErrorCheck | NumberFormatException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private LocalDate parseDateOfBirth(String dateOfBirthString) throws ErrorCheck {
        try {
            return LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new ErrorCheck("Неверный формат даты рождения");
        }
    }

    private long parsePhoneNumber(String phoneNumberString) throws ErrorCheck {
        try {
            return Long.parseLong(phoneNumberString);
        } catch (NumberFormatException e) {
            throw new ErrorCheck("Неверный формат номера телефона");
        }
    }

    private Gender parseGender(String genderString) throws ErrorCheck {
        if (genderString.equalsIgnoreCase("m")) {
            return Gender.MALE;
        } else if (genderString.equalsIgnoreCase("f")) {
            return Gender.FEMALE;
        } else {
            throw new ErrorCheck("Неверный формат пола");
        }
    }
}