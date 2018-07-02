package ru.open.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class DBConnect {
    //db273
    private static final String DB_URL = "jdbc:postgresql://rumskapp266.open.ru:5432/RX_SD";
    private static final String USER = "RX_SD";
    private static final String PASS = "password";
    //dbUIDM
    private static final String DB_URL_UIDM = "jdbc:postgresql://rumskapp445.open.ru:5432/RX_AUDIT";
    private static final String USER_UIDM = "RX_AUDIT";
    private static final String PASS_UIDM = "RX_AUDIT";
    private static Connection connection;
    //statements todo заменить на препаред стейтмент
    //contact_id(tb_contact)->tb_person_contact->tb_organization
    private static final String CURRENT_EMAIL =
            "SELECT address FROM tb_contact WHERE contact_id = 4172";
    private static final String RATE_CHANGE_LOG =
            "select data from \"OperationAudit\" where \"url\" like '%tarif%' and id = 'sso_____b544fcfa-7fd7-45a2-bb41-6ed86e0f8b39' order by \"timeStart\" DESC limit 1";
    private static Connection connectionUIDM;

    private DBConnect() {
    }

    public static void openConnection() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void closeConnections() {
        try {
            connection.close();
        } catch (SQLException e) {
            log.error("connection doesnt close", e);
        }
        try {
            connectionUIDM.close();
        } catch (SQLException e) {
            log.error("connectionUIDM doesnt close", e);
        }

    }

    public static void openConnectionUIDM() throws SQLException {
        connectionUIDM = DriverManager.getConnection(DB_URL_UIDM, USER_UIDM, PASS_UIDM);
    }

    public static String getCurrentEmail() throws SQLException {
        return getFirstOrNull(CURRENT_EMAIL, "address", connection);
    }

    public static String getRateChangeLogs() throws SQLException {
        return getFirstOrNull(RATE_CHANGE_LOG, "data", connectionUIDM);
    }

    private static String getFirstOrNull(String currentEmail, String address, Connection con) throws SQLException {
        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(currentEmail)) {
            //contact_id(tb_contact)->tb_person_contact->tb_organization
            return resultSet.next() ? resultSet.getString(address) : null;
        }
    }
}
