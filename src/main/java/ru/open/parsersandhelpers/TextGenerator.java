package ru.open.parsersandhelpers;


import java.io.IOException;
import java.util.UUID;

public final class TextGenerator {


    public static void main(String[] args) throws IOException {
        LogParser logParser = new LogParser();
        System.out.println(logParser.getLastSmsCode());
    }

    public String generatePassword() {
        int subIndex = 20;
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(subIndex);
        return "!Qw" + uuid;
    }

}
