package OOP.HW_4.data;

import java.util.List;

public class TeacherList implements Iterable<Teacher>{
    private List<Teacher> teachers;
    private StudentGroup group;

    public TeacherList(StudentGroup group, List<Teacher> teachers) {
        this.teachers = teachers;
        this.group = group;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setStudents(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public StudentGroup getStudentGroup() {
        return group;
    }

    public void setStudentGroup(StudentGroup group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teachers=" + teachers +
                ", group=" + group +
                '}';
    }

    @Override
    public TeacherListIterator iterator() {
        return new TeacherListIterator(this);
    }
}