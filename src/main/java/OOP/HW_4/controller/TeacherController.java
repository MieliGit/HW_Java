package OOP.HW_4.controller;

import OOP.HW_4.data.StudentGroup;
import  OOP.HW_4.data.Teacher;
import  OOP.HW_4.service.TeacherListService;
import  OOP.HW_4.service.TeacherService;
import  OOP.HW_4.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherListService teacherListService = new TeacherListService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void createTeacherList(StudentGroup group, List<Teacher> teachers){
        teacherListService.createTeacherList(group, teachers);
        teacherView.sendOnConsoleUserGroup(teacherListService.getTeacherList());
    }

    public void getTeacherInTeacherList(String firstName, String secondName){
        Teacher teacher = teacherListService.getTeacherFromTeacherList(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void getSortedListTeacherFromTeacherList(){
        List<Teacher> teachers = teacherListService.getSortedTeacherList();
        teacherView.sendOnConsole(teachers);
    }

    public void getSortedListByFIOTeacherFromTeacherList(){
        List<Teacher> teachers = teacherListService.getSortedByFIOTeacherList();
        teacherView.sendOnConsole(teachers);
    }
}