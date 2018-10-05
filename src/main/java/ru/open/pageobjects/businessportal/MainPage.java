package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class MainPage extends AbstractPage {

    @FindBy(xpath = "//button[contains(@class, 'topbar__logout')]")
    private SelenideElement signOut;

    @FindBy(xpath = "//*[contains(text(),'Мои счета')]")
    private SelenideElement myAccounts;

    @FindBy(xpath = "//*[contains(text(),'Письма')]")
    private SelenideElement letters;

    @FindBy(xpath = "//button[@class='button_main' and contains(., 'Новый платеж')]")
    private SelenideElement newPay;

    @FindBy(xpath = "//*[contains(text(),'Настройки')]")
    private SelenideElement settings;

    @FindBy(xpath = "//*[contains(text(),'Тарифы')]")
    private SelenideElement rate;

    @FindBy(xpath = "//a[contains(@href,'Контакты')]")
    private SelenideElement contacts;

}
