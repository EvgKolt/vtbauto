package ru.vtb.pageobjects;

import com.codeborne.selenide.Condition;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class YaPage {
    private final String searchBoxId = "text";
    private final String resultQuantityXpath = "//div[@class='serp-adv__found']";

    public void search(String text) {
        $(By.id(searchBoxId)).sendKeys(text);
        $(By.id(searchBoxId)).pressEnter();
    }

    public void checkResults() {
        $(By.xpath(resultQuantityXpath)).waitUntil(Condition.exist, 69999);
        $(By.xpath(resultQuantityXpath)).shouldHave(Condition.or("проверка текста", Condition.text("тыс"), Condition.text("млн")));
    }
}




