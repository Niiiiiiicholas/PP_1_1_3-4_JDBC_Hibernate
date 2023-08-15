package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/forkata";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";



    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("We are connected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("there is no connection... Exception!");
        }
        return connection;
    }
}