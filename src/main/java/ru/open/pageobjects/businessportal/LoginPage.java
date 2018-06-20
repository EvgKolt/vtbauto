package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class LoginPage extends AbstractPage {

    @FindBy(id = "UserName")
    private SelenideElement userName;

    @FindBy(id = "Password")
    private SelenideElement password;

    @FindBy(xpath = "//button[@type='submit' and contains(., 'Войти')]")
    private SelenideElement signIn;

    @FindBy(className = "welcome__login-action")
    private SelenideElement restore;

    @FindBy(className = "welcome__form-error")
    private SelenideElement errorMessage;

    @FindBy(id = "fio-textfield")
    private SelenideElement login;

    @FindBy(className = "step__buttons")
    private SelenideElement restore1;

    @FindBy(id = "smsCode")
    private SelenideElement smsCode;

    @FindBy(xpath = "//*[contains(text(),'Подтвердить')]")
    private SelenideElement confirm;

    @FindBy(id = "password-textfield")
    private SelenideElement newPassword;

    @FindBy(id = "repeat-password-textfield")
    private SelenideElement repeatNewPassword;

    @FindBy(className = "step__buttons")
    private SelenideElement savePassword;

    @FindBy(className = "link-repeat")
    private SelenideElement resendCode;

    @FindBy(className = "code-not-available")
    private SelenideElement wrongCode;

    @FindBy(xpath = "//span[contains(@class, 'error_hint') and text() = 'Пароль должен быть 8 символов или больше.']")
    private SelenideElement errorHint;

    @FindBy(xpath = "//span[contains(@class, 'error_hint') and text() = 'Пароль не соответствует требованиям.']")
    private SelenideElement errorHint1;

    @FindBy(xpath = "//span[contains(@class, 'error_hint') and text() = 'Пароли не совпадают.']")
    private SelenideElement errorHint2;

}



