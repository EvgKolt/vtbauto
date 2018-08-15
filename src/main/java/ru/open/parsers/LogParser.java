package ru.open.parsers;

import lombok.extern.slf4j.Slf4j;
import ru.open.Constants;
import ru.open.dao.DBConnect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

@Slf4j
public final class LogParser {

    public String getLastSmsCode() throws IOException {
        //find last log's message with sms
        String result = getStringWithSms(getSmsLogFilePath("sms.logs.pattern2"));
        if (result != null) return result;
        return null;
    }

    public String getLastSmsCodeForCard() throws IOException {
        //find last log's message with sms
        String result = getStringWithSms(getSmsLogFilePath("sms.logs.pattern2"));
        if (result != null) return result;
        return null;
    }

    public String getLastSmsCodeForReplenishment() throws IOException {
        try (FileReader fileReader = new FileReader(getSmsLogFilePath("sms.logs.pattern2"));
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("N") && line.contains("*0241")) {
                    result = line;
                }
            }
            if (!result.isEmpty()) {
                return result.substring(result.indexOf(":")
                        + 2, result.lastIndexOf("<"));
            }
        }
        return null;
    }

    public String getLastReference() throws IOException {
        //find last log's message with sms
        try (FileReader fileReader = new FileReader(getEmailLogFilePath());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("http://rumskapt273.open.ru/sso/auth/login-password-change")) {
                    result = line;
                }
            }
            if (!result.isEmpty()) {
                return "http://rumskapt273.open.ru/sso/auth/login-password-change"
                        + result.substring(result.indexOf("?code="), result.lastIndexOf("&amp"))
                        + "&client_id=smeportal";
            }
        }
        return null;
    }

    public String getReferenceToChangeEmail() throws IOException {
        //find last log's message with reference for changing email
        try (FileReader fileReader = new FileReader(getEmailLogFilePath());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("http://rumskapt273.open.ru/main/persons/confirm-email")) {
                    result = line;
                }
            }
            if (!result.isEmpty()) {
                return "http://rumskapt273.open.ru/main/persons/confirm-email/"
                        + result.substring(result.indexOf("confirm-email/"), result.lastIndexOf("\"&gt;"));
            }
        }
        return null;
    }

    public void verifyUidmLogs() throws IOException, SQLException {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        String rez = DBConnect.getPhoneChangeLogs();
        String rez1 = DBConnect.getEmailChangeLogs();
        log.info(rez);
        log.info(properties.getProperty("phone").substring(1));
        log.info(rez1);
        log.info(properties.getProperty("email") + properties.getProperty("phone"));
        //todo поправить
        if (!(rez1.contains(properties.getProperty("email")) || rez.contains(properties.getProperty("phone").substring(1)))) {
            log.info("no logs in UIDM! check it manually");
            throw new IllegalArgumentException();
        }
    }

    /////////////////////////////////////service methods////////////////////////////////////
    private String getStringWithSms(String smsLogFilePath) throws IOException {
        try (FileReader fileReader = new FileReader(smsLogFilePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("internetbankmb.open.ru")) {
                    result = line;
                }
            }
            if (!result.isEmpty()) {
                return result.substring(result.indexOf(":")
                        + 2, result.lastIndexOf("<"));
            }
        }
        return null;
    }

    private String getSmsLogFilePath(String property) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty(property)
                    + dateFormat.format(new Date())
                    + ".log";
        }
    }

    private String getEmailLogFilePath() throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty("email.logs.pattern2")
                    + dateFormat.format(new Date())
                    + ".log";
        }
    }
}

