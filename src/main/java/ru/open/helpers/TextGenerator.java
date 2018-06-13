package ru.open.helpers;

import java.util.UUID;

public final class TextGenerator {
    public String generatePassword() {
        int subIndex = 20;
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(subIndex);
        return "!Qw" + uuid;
    }

    public static String generatePhone() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return "+7" + number;
    }
}
