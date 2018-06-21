package ru.open.helpers;

import java.util.UUID;

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

    public String generateEmail() {
        return null;
    }

    public String generateLogin() {
        return null;
    }
}
