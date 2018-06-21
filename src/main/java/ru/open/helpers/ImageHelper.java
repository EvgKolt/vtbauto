package ru.open.helpers;

import lombok.extern.slf4j.Slf4j;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

@Slf4j
public final class ImageHelper {
    public Match checkImage(String imageName) {
        Screen screen = new Screen();
        Pattern pattern = new Pattern(imageName);
        return screen.exists(pattern);
    }

    public void clickImage(String imageName) {
        Screen screen = new Screen();
        Pattern pattern = new Pattern(imageName);
        try {
            screen.click(pattern);
        } catch (FindFailed findFailed) {
            log.error("no such image");
            findFailed.printStackTrace();
        }
    }
}
