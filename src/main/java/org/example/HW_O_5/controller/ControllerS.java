package org.example.HW_O_5.controller;


import org.example.HW_O_5.model.Student;
import org.example.HW_O_5.model.Type;
import org.example.HW_O_5.model.User;
import org.example.HW_O_5.service.UserService;
import org.example.HW_O_5.view.StudentView;

import java.util.List;

    public class ControllerS {
            private final UserService service = new UserService();
            private final StudentView studentView = new StudentView();


            public void createStuden(String name, String surname, String patron) {
                service.create(name, surname, patron, Type.STUDENT);
            }



            public void getAllStudent() {
                List<User> studentList = service.readOnlyStudent();
                for (User user : studentList) {
                    Student student = (Student) user;
                    studentView.printConsole(student);
                }
            }
    }
