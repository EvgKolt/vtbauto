package ru.open.dao;

import lombok.extern.slf4j.Slf4j;
import ru.open.Constants;
import ru.open.entities.MSBClient;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

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
    //dbCards
    private static final String DB_URL_CARDS = "jdbc:postgresql://rumskapt242.open.ru:5432/RX_SD";
    private static final String USER_CARDS = "RX_SD";
    private static final String PASS_CARDS = "password";

    private static Connection connection;
    private static Connection connectionUIDM;
    private static final String SET_CARD_STATUS =
            "UPDATE tb_corporate_card SET status = ? WHERE organization_id = ?";
    private static final String EMAIL_CHANGE_LOG =
            "SELECT data FROM \"OperationAudit\" where \"url\" like '%mail%'  order by \"timeStart\" DESC limit 1";
    private static final String DELETE_CARD_ORDER =
            "DELETE FROM tb_corporate_card WHERE organization_id = ?";
    //contact_id(tb_contact)->tb_person_contact->tb_organization
    private static final String CURRENT_EMAIL =
            "SELECT address FROM tb_contact WHERE contact_id = ?";
    private static final String PHONE_CHANGE_LOG =
            "SELECT data FROM \"OperationAudit\" where \"url\" like '%Phone%' order by \"timeStart\" DESC limit 1";
    private static final String GET_CARD_STATUS =
            "SELECT status FROM tb_corporate_card WHERE organization_id = ?";
    private static final String GET_VALIDATING_STATUS = "select validating_status from tb_payment_pattern order by id desc limit 1";
    private static Connection connectionCards;

    public static void openConnection() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void openConnectionCards() throws SQLException {
        connectionCards = DriverManager.getConnection(DB_URL_CARDS, USER_CARDS, PASS_CARDS);
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
        try {
            connectionCards.close();
        } catch (SQLException e) {
            log.error("connection doesnt close", e);
        }

    }

    public static void openConnectionUIDM() throws SQLException {
        connectionUIDM = DriverManager.getConnection(DB_URL_UIDM, USER_UIDM, PASS_UIDM);
    }

    public static void deleteCardOrderStatusFromBase() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(DELETE_CARD_ORDER)) {
            statement.setString(1, MSBClient.ORGANIZATION_ID_CARD);
            int n = statement.executeUpdate();
            log.info("cardOrderDeleted {}", n);
        }
    }

    public static String getCurrentEmail() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(CURRENT_EMAIL)) {
            statement.setInt(1, MSBClient.CONTACT_ID);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next() ? resultSet.getString("address") : null;
        }
    }

    public static void verifyCardStatus(String status) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(GET_CARD_STATUS)) {
            statement.setString(1, MSBClient.ORGANIZATION_ID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                assertThat(resultSet.getString("status"), containsString(status));
                log.info("status ok");
            } else {
                log.info("mistake!! \"SELECT status FROM tb_corporate_card WHERE organization_id = ?\"");
                throw new IllegalArgumentException();
            }
        }
    }

    public static void setCardStatus(String status) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(SET_CARD_STATUS)) {
            statement.setString(1, status);
            statement.setString(2, MSBClient.ORGANIZATION_ID);
            statement.executeUpdate();
            log.info(status + " status set");
        }
    }

    public static String getEmailChangeLogs() throws SQLException {
        return getFirstOrNull(EMAIL_CHANGE_LOG, "data", connectionUIDM);
    }

    public static String getPhoneChangeLogs() throws SQLException {
        return getFirstOrNull(PHONE_CHANGE_LOG, "data", connectionUIDM);
    }

    private static String getFirstOrNull(String currentEmail, String address, Connection con) throws SQLException {
        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(currentEmail)) {
            //contact_id(tb_contact)->tb_person_contact->tb_organization
            return resultSet.next() ? resultSet.getString(address) : null;
        }
    }

    public static void getValidatingStatus() throws SQLException, IOException {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        properties.setProperty("tmp", getFirstOrNull(GET_VALIDATING_STATUS, "validating_status", connection));
        try (FileWriter fileWriter = new FileWriter(Constants.PROPERTY_PATH)) {
            properties.store(fileWriter, "");
        }
    }
}
