package ru.open.helpers;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Slf4j
public class AshotHelper {
    //screenshot's name = domen+element+browser+res(241_LoginPage_IE_1920.png)
    private final String actualDir = "C:\\Jenkins513\\workspace\\MSB-Portal\\CucumberTests\\screenshots\\actual\\";
    private final String expectedDir = "C:\\Jenkins513\\workspace\\MSB-Portal\\CucumberTests\\screenshots\\expected\\";
    private final String diffDir = "C:\\Jenkins513\\workspace\\MSB-Portal\\CucumberTests\\screenshots\\diff\\";

    public void doScreenCheck(String name) throws AWTException, IOException {
        //move mouse away
        Robot robot = new Robot();
        robot.mouseMove(0, 0);
        //take a "selfie"
        Screenshot actualScreenshot = new AShot().takeScreenshot(getWebDriver());
        File actualFile = new File(actualDir + name + ".png");
        ImageIO.write(actualScreenshot.getImage(), "png", actualFile);
        //expected selfie
        Screenshot expextedScreenshot = new Screenshot(ImageIO.read(new File(expectedDir + name + ".png")));
        ImageDiff diff = new ImageDiffer().makeDiff(expextedScreenshot, actualScreenshot);
        if (diff.getDiffSize() != 0) {
            File diffFile = new File(diffDir + name + ".png");
            ImageIO.write(diff.getMarkedImage(), "png", diffFile);
            Assert.assertEquals(0, diff.getDiffSize());
        }
    }

    public void doScreenAndScroll(String name) throws AWTException, IOException {
        Robot robot = new Robot();
        robot.mouseMove(0, 0);

        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(getWebDriver());
        File expectedFile = new File(expectedDir + name + ".png");
        ImageIO.write(screenshot.getImage(), "png", expectedFile);
    }


}
