package org.example.HW_O_5.service;

import org.example.HW_O_5.model.Student;
import org.example.HW_O_5.model.Teacher;
import org.example.HW_O_5.model.Type;
import org.example.HW_O_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, patron, id);
            userList.add(student);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (user instanceof Student && isStudent) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnlyStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }

}
