package ru.open.helpers;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import ru.open.dao.DBConnect;

import java.sql.SQLException;
import java.util.UUID;

@Slf4j
public final class TextGenerator {
    private static final int SUBINDEX = 20;
    private static final long GETPHONE1 = 1_000_000_00L;
    private static final long GETPHONE2 = 9_000_000_00L;

    public static String generatePhone() {
        long number = (long) Math.floor(Math.random() * GETPHONE2) + GETPHONE1;
        return "9" + Long.toString(number);
    }

    public String generatePassword() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(SUBINDEX);
        return "!Qw" + uuid;
    }

    public static String generateEmail() throws SQLException {
        return "evgeniy.koltunovskiy@open.ru".equals(DBConnect.getCurrentEmail())
                ? "qa.automation@open.ru"
                : "evgeniy.koltunovskiy@open.ru";
    }

    public String generateLogin() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(SUBINDEX);
    }

    public String generateSecretWord() {
        int stringLength = 10;
        return RandomStringUtils.randomAlphabetic(stringLength).toUpperCase();
    }
}



