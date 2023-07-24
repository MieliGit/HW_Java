package org.example.HW_O_5.model;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, String surname, String patron, int teacherId) {
        super(name, surname, patron);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patron='" + patron + '\'' +
                '}';
    }
}
