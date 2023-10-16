package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/baseone";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1234";
    public static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Произошла ошибка соединения!");
        }
        return connection;
    }


}
