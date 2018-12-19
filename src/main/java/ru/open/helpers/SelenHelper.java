package ru.open.helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import ru.open.Constants;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;


@Slf4j
public final class SelenHelper {
    public void clear(String path) {
        SelenideElement selenideElement = $(By.xpath(path));
        selenideElement.clear();
    }

    public void switchToWindow(String title) {
        switchTo().window(Integer.parseInt(title));
    }

    public void clickElementByJE(String element) {
        SelenideElement selenideElement = $(By.xpath(element));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        javascriptExecutor.executeScript("arguments[0].click();", selenideElement);
    }

    public void refreshPage() {
        getWebDriver().navigate().refresh();
    }

    public String getValue(String xpath) throws IOException {
        $(By.xpath(xpath)).waitUntil(Condition.exist, 60000);
        String value = $(By.xpath(xpath)).getValue();
        log.info(value);
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        properties.setProperty("tmp", value);
        try (FileWriter fileWriter = new FileWriter(Constants.PROPERTY_PATH)) {
            properties.store(fileWriter, "");
        }
        return value;
    }

    public void verifyElementFromtmp() throws IOException {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        String tmp = properties.getProperty("tmp");
        String xpath = "//*[contains(text(),'" + tmp + "')]";
        log.info($(By.xpath(xpath)).getText());
        assertThat($(By.xpath(xpath)).getText(), containsString(tmp));
    }

    public void switchHandleTo(String handleNumber) {
        ArrayList<String> handles = new ArrayList<>(getWebDriver().getWindowHandles());
        log.info("/////////////////////////" + handles.toString());
        getWebDriver().switchTo().window(handles.get(Integer.parseInt(handleNumber)));
        log.info(handles.toString());
    }
}
