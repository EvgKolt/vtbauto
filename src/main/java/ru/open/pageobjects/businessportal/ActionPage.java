package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class ActionPage extends AbstractPage {

    @FindBy(xpath = "//button[contains(., 'Написать сообщение')]")
    private SelenideElement writeLetter;

    @FindBy(className = "Select-placeholder")
    private SelenideElement questionCategory;

    @FindBy(xpath = "//*[contains(text(),'Открытие счета')]")
    private SelenideElement openAccount;

    @FindBy(xpath = "//input[@type='text']")
    private SelenideElement theme;

    @FindBy(xpath = "//textarea[contains(@rows, '6')]")
    private SelenideElement message;

    @FindBy(className = "input-container_files")
    private SelenideElement addFile;

    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    private SelenideElement sendMessage;

    @FindBy(xpath = "//*[contains(text(),'TESTOVII ZAPROS')]")
    private SelenideElement testRequest;

    @FindBy(xpath = "(//*[contains(text(),'Изменить')])[2]")
    private SelenideElement changePhone;

    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/form/div[3]/div/div/div/input")
    private SelenideElement inputNumber;

    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/form/div[4]/div/button[1]/div")
    private SelenideElement savePhone;

    @FindBy(className = "input-style")
    private SelenideElement smsCode;

    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    private SelenideElement sign;

    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div/input")
    private SelenideElement phone;

    @FindBy(className = "drawer-exit__button")
    private SelenideElement close;

}
