package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Boris", "Britva", (byte) 21);
        userService.saveUser("Alex", "Petrov", (byte) 21);
        userService.saveUser("Ivan", "Ivanov", (byte) 21);
        userService.saveUser("Ivan", "Petrov", (byte) 21);

        userService.removeUserById(3);
        userService.getAllUsers().forEach(System.out::println);


        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
