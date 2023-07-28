package org.example.HW_O_5.service;
import org.example.HW_O_5.model.Type;
import org.example.HW_O_5.model.User;

import java.util.List;

public interface DataServiceT {
    void create(String name, String surname, String patron, Type type);

    List<User> read();
    List<User> readOnlyTeacher();
}
