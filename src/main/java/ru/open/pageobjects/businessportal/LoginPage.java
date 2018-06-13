package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;
import ru.open.pageobjects.NameOfElement;

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
    @FindBy(id = "fio-textfield")
    public SelenideElement login;

    @NameOfElement("Восстановить_")
    @FindBy(className = "step__buttons")
    public SelenideElement restore2;

    @NameOfElement("СМС код")
    @FindBy(id = "smsCode")
    public SelenideElement smscode;

    @NameOfElement("Подтвердить")
    @FindBy(xpath = "//*[contains(text(),'Подтвердить')]")
    public SelenideElement confirm;

    @NameOfElement("Новый пароль")
    @FindBy(id = "password-textfield")
    public SelenideElement newpassword;

    @NameOfElement("Повторить новый пароль")
    @FindBy(id = "repeat-password-textfield")
    public SelenideElement repeatnewpassword;

    @NameOfElement("Сохранить пароль")
    @FindBy(className = "step__buttons")
    public SelenideElement savepassword;

    @NameOfElement("Выслать код повторно")
    @FindBy(className = "link-repeat")
    public SelenideElement resendcode;

    @NameOfElement("Неверный код")
    @FindBy(className = "code-not-available")
    public SelenideElement wrongcode;

    @NameOfElement("Пароль меньше 8")
    @FindBy(xpath = "//span[contains(@class, 'error_hint') and text() = 'Пароль должен быть 8 символов или больше.']")
    public SelenideElement errorhint;

    @NameOfElement("Пароль не подходит")
    @FindBy(xpath = "//span[contains(@class, 'error_hint') and text() = 'Пароль не соответствует требованиям.']")
    public SelenideElement errorhint1;

    @NameOfElement("Пароли не совпадают")
    @FindBy(xpath = "//span[contains(@class, 'error_hint') and text() = 'Пароли не совпадают.']")
    public SelenideElement errorhint2;
}

