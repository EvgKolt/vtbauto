package ru.open.pageobjects.shugar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class ShugarLoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='user_name']")
    private SelenideElement login;

    @FindBy(xpath = "//input[@id='user_password']")
    private SelenideElement password;

    @FindBy(xpath = "//input[@id='login_button']")
    private SelenideElement signIn;


}
