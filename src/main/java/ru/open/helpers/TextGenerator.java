package ru.open.helpers;

import java.util.UUID;

public final class TextGenerator {
    private static final int subIndex = 20;
    private static final long genPhone1 = 1_000_000_000L;
    private static final long genPhone2 = 9_000_000_000L;
    public String generatePassword() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(subIndex);
        return "!Qw" + uuid;
    }

    public static String generatePhone() {
        long number = (long) Math.floor(Math.random() * genPhone2) + genPhone1;
        return "+7" + number;
    }
}
