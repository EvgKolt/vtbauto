package ru.open.parsersandhelpers;


import java.io.IOException;

public final class TextGenerator {


    public static void main(String[] args) throws IOException {
        LogParser logParser = new LogParser();
        System.out.println(logParser.getLastSmsCode());
    }
}
