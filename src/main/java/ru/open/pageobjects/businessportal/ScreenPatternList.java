package ru.open.pageobjects.businessportal;

import lombok.Getter;
import org.sikuli.script.Pattern;


@Getter
public class ScreenPatternList {
    private final Pattern downloadFile = new Pattern("src/main/resources/imgs/downloadfile.png");
}
