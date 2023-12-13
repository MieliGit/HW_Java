package OOP.HW_4.service;

import OOP.HW_4.data.Teacher;
import OOP.HW_4.data.UserComparator;
import OOP.HW_4.data.TeacherList;
import OOP.HW_4.data.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherListService {
    private TeacherList teacherList;

    public void createTeacherList(StudentGroup group, List<Teacher> teachers) {
        this.teacherList = new TeacherList(group, teachers);
    }

    public TeacherList getTeacherList() {
        return teacherList;
    }

    public Teacher getTeacherFromTeacherList(String firstName, String secondName){
        Iterator<Teacher> iterator = teacherList.iterator();
        List<Teacher> result = new ArrayList<>();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if(teacher.getFirstName().equalsIgnoreCase(firstName)
                    && teacher.getSecondName().equalsIgnoreCase(secondName)){
                result.add(teacher);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Учитель с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного учителя с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Teacher> getSortedTeacherList(){
        List<Teacher> teachers = new ArrayList<>(teacherList.getTeachers());
        Collections.sort(teachers);
        return teachers;
    }

    public List<Teacher> getSortedByFIOTEacherList(){
        List<Teacher> teachers = new ArrayList<>(teacherList.getTeachers());
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }
}