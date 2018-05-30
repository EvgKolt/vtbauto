package ru.open.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @NameOfElement("Имя пользователя")
    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public SelenideElement username;

    @NameOfElement("Пароль")
    @FindBy(xpath = "//*[@id=\"Password\"]")
    public SelenideElement password;

    @NameOfElement("Войти")
    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div/div[2]/div/div[2]/form/div[4]/div[1]")
    public SelenideElement signin;

    @NameOfElement("Восстановить")
    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div/div[2]/div/div[2]/form/div[4]/div[2]/a")
    public SelenideElement restore;

    @NameOfElement("Неправильный логин")
    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div/div[2]/div/div[2]/form/div[5]/div[3]/div")
    public SelenideElement errormessage;

}
