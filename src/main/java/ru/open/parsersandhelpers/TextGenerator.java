package ru.open.parsersandhelpers;


import java.util.UUID;

public final class TextGenerator {

    public String generatePassword() {
        int subIndex = 20;
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(subIndex);
        return "!Qw" + uuid;
    }

}
