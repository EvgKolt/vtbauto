package ru.open.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @NameOfElement("Имя пользователя")
    @FindBy(id = "UserName")
    public SelenideElement username;

    @NameOfElement("Пароль")
    @FindBy(id = "Password")
    public SelenideElement password;

    @NameOfElement("Войти")
    @FindBy(xpath = "//button[@type='submit' and contains(., 'Войти')]")
    public SelenideElement signin;

    @NameOfElement("Восстановить")
    @FindBy(className = "welcome__login-action")
    public SelenideElement restore;

    @NameOfElement("Неверный логин")
    @FindBy(className = "welcome__form-error")
    public SelenideElement errormessage;

    @NameOfElement("Логин")
    @FindBy(id = "//*[@id=\"fio-textfield\"]")
    public SelenideElement login;


}
