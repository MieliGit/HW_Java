package OOP.HW_4.data;

import java.util.Iterator;
import java.util.List;

public class TeacherListIterator implements Iterator<Teacher> {

    private int counter;
    private final List<Teacher> teachers;

    public TeacherListIterator(TeacherList teacherList) {
        this.teachers = teacherList.getTeachers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return teachers.get(counter);
    }
}