package ru.open.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBConnect {
    private static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials (example)
    private static final String USER = "sa";
    private static final String PASS = "";
    private static Connection connection;

    public static void openConnection() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);

    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            log.error("connection doesnt close", e);
        }
    }

    public static void create() {

    }

}
