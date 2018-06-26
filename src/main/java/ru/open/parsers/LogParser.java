package ru.open.parsers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import ru.open.Constants;

public final class LogParser {

    private String getSmsLogFilePath() throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty("sms.logs.pattern")
                    + dateFormat.format(new Date())
                    + ".log";
        }
    }

    private String getEmailLogFilePath() throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty("email.logs.pattern")
                    + dateFormat.format(new Date())
                    + ".log";
        }
    }

    public String getLastSmsCode() throws IOException {
        //find last log's message with sms
        try (FileReader fileReader = new FileReader(getSmsLogFilePath());
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
}

