package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Boris", "Britva", (byte) 21);
        userService.saveUser("Alex", "Petrov", (byte) 21);
        userService.saveUser("Ivan", "Ivanov", (byte) 21);
        userService.saveUser("Ivan", "Petrov", (byte) 21);

        userService.removeUserById(3);
        for (User user1 :userService.getAllUsers() ) {
            System.out.println(user1);
        }


        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
