package OOP.HW_4.view;

import OOP.HW_4.data.StudentGroup;
import OOP.HW_4.data.Teacher;
import OOP.HW_4.data.TeacherList;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> students) {
        for(Teacher user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(TeacherList teacherList){
        logger.info(teacherList.toString());
    }

}