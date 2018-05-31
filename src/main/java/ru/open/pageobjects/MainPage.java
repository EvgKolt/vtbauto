package ru.open.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @NameOfElement("Выйти")
    @FindBy(xpath = "//button[@title='Выйти из профиля']")
    public SelenideElement logout;

    @NameOfElement("Мои счета")
    @FindBy(xpath = "//a[contains(@href,'Мои счета')]")
    public SelenideElement myaccounts;

    @NameOfElement("Письма")
    @FindBy(xpath = "//a[contains(@href,'messages')]")
    public SelenideElement letters;

    @NameOfElement("Новый платеж")
    @FindBy(xpath = "//button[@class='button_main' and contains(., 'Новый платеж')]")
    public SelenideElement newpay;

    @NameOfElement("Настройки")
    @FindBy(xpath = "//a[contains(@href,'Настройки')]")
    public SelenideElement settings;

    @NameOfElement("Тарифы")
    @FindBy(xpath = "//a[contains(@href,'Тарифы')]")
    public SelenideElement rate;

    @NameOfElement("Контакты")
    @FindBy(xpath = "//a[contains(@href,'Контакты')]")
    public SelenideElement contacts;

}
