package org.example.HW_O_5.controller;

import org.example.HW_O_5.model.Teacher;
import org.example.HW_O_5.model.Type;
import org.example.HW_O_5.model.User;
import org.example.HW_O_5.service.UserServiceT;
import org.example.HW_O_5.view.TeacherView;

import java.util.List;

public class ControllerT {
    private final UserServiceT service = new UserServiceT();

    private final TeacherView teacherView = new TeacherView();

    public void createTeacher(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.TEACHER);
    }


    public void getAllTeacher() {
        List<User> teacherList = service.readOnlyTeacher();
        for (User user : teacherList) {
            Teacher teacher = (Teacher) user;
            teacherView.printConsole(teacher);
        }
    }
}

