package ru.open.helpers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import ru.open.Constants;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

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
        String value = $(By.xpath(xpath)).getValue();
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
}
