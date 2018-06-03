package ru.open.parsersandhelpers;

import ru.open.entities.PropertyPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public final class LogParser {

    public static void main(String[] args) throws IOException {
        //getSmsLogFilePath();
        LogParser logParser = new LogParser();
        System.out.println(logParser.getLastSmsByTag());
    }

    private String getSmsLogFilePath() throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (FileReader fileReader = new FileReader(PropertyPath.getPROPERTYPATH())) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty("smslogspattern") + dateFormat.format(new Date()) + ".log";
        }
    }

    private String getEmailLogFilePath() throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (FileReader fileReader = new FileReader(PropertyPath.getPROPERTYPATH())) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty("emaillogspattern") + dateFormat.format(new Date()) + ".log";
        }
    }

    public String getLastSmsByTag() throws IOException {
        //find last log's message with sms
        try (FileReader fileReader = new FileReader(getSmsLogFilePath());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String result = "";
            String line;
            while (((line = bufferedReader.readLine()) != null)) {
                if (line.contains("internetbankmb.open.ru")) {
                    result = line;
                }
            }
            if (!(result.isEmpty())) {
                return result.substring(result.indexOf(":") + 2, result.lastIndexOf("<"));
            }
        }
        return null;
    }

}

