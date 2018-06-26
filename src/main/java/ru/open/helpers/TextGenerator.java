package ru.open.helpers;

import java.sql.SQLException;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import ru.open.dao.DBConnect;

@Slf4j
public final class TextGenerator {
    private static final int SUBINDEX = 20;
    private static final long GETPHONE1 = 1_000_000_000L;
    private static final long GETPHONE2 = 9_000_000_000L;

    public static String generatePhone() {
        long number = (long) Math.floor(Math.random() * GETPHONE2) + GETPHONE1;
        return "+7" + number;
    }

    public String generatePassword() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(SUBINDEX);
        return "!Qw" + uuid;
    }

    public static String generateEmail() throws SQLException, ClassNotFoundException {
        if ("evgeniy.koltunovskiy@open.ru".equals(DBConnect.getCurrentEmail())) {
            return "qa.automation@open.ru";
        } else {
            return "evgeniy.koltunovskiy@open.ru";
        }
    }

    public String generateLogin() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(SUBINDEX);
    }

}

