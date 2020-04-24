package ru.vtb.steps;

import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import ru.vtb.pageobjects.YaPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


@Slf4j
public class YaSteps {
    @Пусть("^пользователь открыл \"([^\"]*)\"$")
    public void пользовательОткрыл(String site) {
        open(site);
        getWebDriver().manage().window().maximize();
    }

    @И("^ввел в поиск данные \"([^\"]*)\"$")
    public void ввелВПоискДанные(String data) {
        YaPage yaPage = new YaPage();
        yaPage.search(data);
    }

    @Тогда("^результат поиска не менее тысячи")
    public void результатПоискаНеМенее() {
        YaPage yaPage = new YaPage();
        yaPage.checkResults();
    }
}
