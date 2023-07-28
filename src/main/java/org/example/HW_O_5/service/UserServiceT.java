package org.example.HW_O_5.service;

import org.example.HW_O_5.model.Student;
import org.example.HW_O_5.model.Teacher;
import org.example.HW_O_5.model.Type;
import org.example.HW_O_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceT implements DataServiceT {

    private List<User> userListT = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);

        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, patron, id);
            userListT.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userListT) {
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
        return userListT;
    }


    public List<User> readOnlyTeacher() {
        List<User> teachers = new ArrayList<>();
        for (User user : userListT) {
            if (user instanceof Teacher) {
                teachers.add(user);
            }
        }
        return teachers;
    }
}
