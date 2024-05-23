package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl testUser = new UserServiceImpl();

        testUser.createUsersTable();
        testUser.saveUser("Petr", "Petrov", (byte) 10);
        testUser.saveUser("Ivan", "Ivanov", (byte) 20);
        testUser.saveUser("Sergey", "Sergeev", (byte) 30);
        testUser.saveUser("Anton", "Antonov", (byte) 40);

        for (User user : testUser.getAllUsers()) {
            System.out.println(user);
        }

        testUser.cleanUsersTable();
        testUser.dropUsersTable();
    }
}
