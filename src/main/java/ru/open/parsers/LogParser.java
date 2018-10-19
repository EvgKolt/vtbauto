package ru.open.parsers;

import lombok.extern.slf4j.Slf4j;
import ru.open.Constants;
import ru.open.dao.DBConnect;
import ru.open.entities.MSBClient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

@Slf4j
public final class LogParser {

    public String getLastSmsCode() throws IOException {
        //find last log's message with sms
        String result = getStringWithSms(getSmsLogFilePath("sms.logs.pattern2"));
        if (result != null) return result;
        return null;
    }

    public String getLastSmsCodeForKhabensky() throws IOException {
        //find last log's message with sms
        String result = getStringWithSmsForKhabensky(getSmsLogFilePath("sms.logs.pattern2"));
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
                if (line.contains("N") && line.contains(MSBClient.ACC_LAST_NUMBER)) {
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

    public String getReferenceToChangeEmail() throws IOException, InterruptedException {
        //find last log's message with reference for changing email
        try (FileReader fileReader = new FileReader(getEmailLogFilePath());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("http://rumskapt273.open.ru/app/accounts/persons/confirm-email")) {
                    result = line;
                }
            }
            if (result.isEmpty()) {
                Thread.sleep(30000);
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("http://rumskapt273.open.ru/app/accounts/persons/confirm-email")) {
                        result = line;
                    }
                }
            }
            if (!result.isEmpty()) {
                return "http://rumskapt273.open.ru/app/accounts/persons/confirm-email/"
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
        if (!(rez.contains(properties.getProperty("phone").substring(1)))) {
            log.info("no logs in UIDM! check it manually");
            throw new IllegalArgumentException();
        }
    }

    public void compareProperties(String props) throws IOException {
        String[] prop = props.split(",");
        String prop1 = prop[0];
        String prop2 = prop[1];
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        log.info(properties.getProperty(prop1));
        log.info(properties.getProperty(prop2));
        assertThat(properties.getProperty(prop2),
                containsString(properties.getProperty(prop1)));
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

    private String getStringWithSmsForKhabensky(String smsLogFilePath) throws IOException {
        try (FileReader fileReader = new FileReader(smsLogFilePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("<Body>") && line.contains("1,000.00")) {
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

