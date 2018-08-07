package ru.open.helpers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

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
}
