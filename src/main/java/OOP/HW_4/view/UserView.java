package OOP.HW_4.view;

import OOP.HW_4.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}