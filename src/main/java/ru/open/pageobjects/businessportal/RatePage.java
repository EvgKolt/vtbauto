package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class RatePage extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(),'Быстрый рост')]")
    private SelenideElement rateName1;

    @FindBy(xpath = "//*[contains(text(),'дело')]")
    private SelenideElement rateName2;

    @FindBy(xpath = "//*[contains(text(),'мир')]")
    private SelenideElement rateName3;

    @FindBy(xpath = "//*[contains(text(),'возможности')]")
    private SelenideElement rateName4;

    @FindBy(xpath = "(//div[contains(@class, 'item-sticky___1aqZB')])[2]")
    private SelenideElement switchTo1;

    @FindBy(xpath = "(//div[contains(@class, 'item-sticky___1aqZB')])[3]")
    private SelenideElement switchTo2;

    @FindBy(xpath = "(//div[contains(@class, 'item-sticky___1aqZB')])[4]")
    private SelenideElement switchTo3;

    @FindBy(xpath = "(//div[contains(@class, 'item-sticky___1aqZB')])[5]")
    private SelenideElement switchTo4;

    @FindBy(xpath = "//*[contains(text(),'Подключить')]")
    private SelenideElement switchRate;

    @FindBy(xpath = "//*[contains(text(),'Подтвердить')]")
    private SelenideElement confirm;

    @FindBy(xpath = "//*[contains(text(),'Гибкий')]")
    private SelenideElement depo1;

    @FindBy(xpath = "//*[contains(text(),'Комфорт')]")
    private SelenideElement depo2;

    @FindBy(xpath = "//*[contains(text(),'Классика')]")
    private SelenideElement depo3;

    @FindBy(xpath = "//*[contains(text(),'На остаток')]")
    private SelenideElement depo4;


}
