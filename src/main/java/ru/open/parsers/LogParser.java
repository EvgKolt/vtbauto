package ru.open.parsers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import ru.open.Constants;
import ru.open.dao.DBConnect;
import ru.open.pageobjects.AbstractPage;
import ru.open.pageobjects.businessportal.ActionPage;

public final class LogParser {

    public String getLastSmsCode() throws IOException {
        //find last log's message with sms
        String result = getStringWithSms(getSmsLogFilePath("sms.logs.pattern"));
        if (result != null) return result;
        return null;
    }

    public String getLastSmsCodeForCard() throws IOException {
        //find last log's message with sms
        String result = getStringWithSms(getSmsLogFilePath("sms.logs.pattern2"));
        if (result != null) return result;
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

    public String getLastRate() throws SQLException {
        //get current rate from bdUIDM
        String rez = DBConnect.getRateChangeLogs();
        return rez.substring(rez.lastIndexOf("<new_value>") + "<new_value>".length(), rez.lastIndexOf("</new_value>"));
    }

    public void verifyLogs() throws IOException {
        //client can't change rate at the end of month, so check:
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (dayOfMonth > 25) {
            return;
        }
        AbstractPage abstractPage = new ActionPage();
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        //choose new rate from property new.rate(generated before)
        switch (properties.getProperty("new.rate")) {
        case "PROMO":
            abstractPage.get("ratesTableSecondOption").click();
        case "COMFORT":
            abstractPage.get("ratesTableThirdOption").click();
        case "BUSINESS":
            abstractPage.get("ratesTableFirstOption").click();
        }
        abstractPage.get("changeRateButton").click();
        //todo - доделать - bugs
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
            return properties.getProperty("email.logs.pattern")
                    + dateFormat.format(new Date())
                    + ".log";
        }
    }
}

