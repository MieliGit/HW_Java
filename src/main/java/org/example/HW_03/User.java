package org.example.HW_03;
import java.time.LocalDate;

public class User {

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthday;
    private long phone;
    private Gender gender;

    public User(String lastName, String firstName, String middleName, LocalDate birthday,
                long phone, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public long getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }
}