package ru.open.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class DBConnect {
    private static final String DB_URL = "jdbc:postgresql://rumskapp266.open.ru:5432/RX_SD";
    //  Database credentials (example)
    private static final String USER = "RX_SD";
    private static final String PASS = "password";
    private static Connection connection;
    //statements
    //contact_id(tb_contact)->tb_person_contact->tb_organization
    private static final String CURRENT_EMAIL = "SELECT address FROM tb_contact WHERE contact_id = 4172";

    private DBConnect() {
    }

    private static void openConnection() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    private static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            log.error("connection doesnt close", e);
        }
    }

    public static String getCurrentEmail() throws SQLException, ClassNotFoundException {
        openConnection();
        Statement statement = connection.createStatement();
        //contact_id(tb_contact)->tb_person_contact->tb_organization
        ResultSet resultSet = statement.executeQuery(CURRENT_EMAIL);
        String rez = null;
        while (resultSet.next()) {
            rez = resultSet.getString("address");
        }
        closeConnection();
        return rez;
    }

}
