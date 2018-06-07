package ru.open.parsersandhelpers;

import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public final class ImageHelper {
    public Match checkImage(String imageName) {
        Screen screen = new Screen();
        Pattern pattern = new Pattern(imageName);
        return screen.exists(pattern);
    }
}
