package ru.open.helpers;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class SelenHelper {
    public void clear(String path) {
        SelenideElement selenideElement = $(By.xpath(path));
        selenideElement.clear();
    }
}
