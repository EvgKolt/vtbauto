package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class ActionPage extends AbstractPage {

    @FindBy(xpath = "//button[contains(., 'Новое сообщение')]")
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

    @FindBy(xpath = "(//*[contains(text(),'Изменить')])[1]")
    private SelenideElement changeEmail;

    @FindBy(xpath = "(//*[contains(text(),'Изменить')])[3]")
    private SelenideElement changeLogin;

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

    @FindBy(xpath = "//input[@type='password']")
    private SelenideElement currentPass;

    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/form/div[3]/div/div/div/input")
    private SelenideElement newLogin;

    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    private SelenideElement saveLogin;

    @FindBy(id = "smsCode")
    private SelenideElement smsCode1;

    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    private SelenideElement confirm1;

    @FindBy(xpath = "//label[text()='Новый e-mail']/../..//input")
    private SelenideElement newEmail;

    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    private SelenideElement saveEmail;

    @FindBy(xpath = "//input[contains(@class, 'input-style')]")
    private SelenideElement smsCode2;

    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/input")
    private SelenideElement currentEmail;

    @FindBy(xpath = "(//input)[1]")
    private SelenideElement email;

    @FindBy(xpath = "(//div[contains(@class, 'card-item__title__text')])[1]")
    private SelenideElement rate1;

    @FindBy(xpath = "//span/div/span")
    private SelenideElement rateInfo;

    @FindBy(xpath = "(//div[contains(@class, 'card-item__title__text')])[2]")
    private SelenideElement rate2;

    @FindBy(xpath = "(//div[contains(@class, 'card-item__title__text')])[3]")
    private SelenideElement rate3;

    @FindBy(xpath = "//span/a")
    private SelenideElement account;

    @FindBy(xpath = "//h3[contains(@class, 'small-title')]")
    private SelenideElement rateInfo1;

    @FindBy(xpath = "//a[contains(@class, 'collapse-panel_false')]")
    private SelenideElement rateInfo2;

    @FindBy(xpath = "//span[contains(@class, 'tariff_item__description tariff_item__small')]")
    private SelenideElement rateInfo3;

    @FindBy(xpath = "//li[contains(@class, 'actions-item actions__item actions-item_change')]")
    private SelenideElement changeRate;

    @FindBy(xpath = "//div[contains(@class, 'Select-value')]")
    private SelenideElement ratesTable;

    @FindBy(xpath = "//div[@id='react-select-5--option-0']")
    private SelenideElement ratesTableFirstOption;

    @FindBy(xpath = "//div[@id='react-select-5--option-1']")
    private SelenideElement ratesTableSecondOption;

    @FindBy(xpath = "//div[@id='react-select-5--option-2']")
    private SelenideElement ratesTableThirdOption;

    @FindBy(xpath = "//div[contains(@class, 'btn-container primary-btn__active label-as-text')]")
    private SelenideElement changeRateButton;

    @FindBy(xpath = "//li[contains(@class, 'actions-item actions__item actions-item_certificates')]")
    private SelenideElement help;

    @FindBy(id = "react-select-2--value")
    private SelenideElement helpMenu;

    @FindBy(xpath = "//div[@id='react-select-2--option-2']")
    private SelenideElement helpMenuOptionOne;

    @FindBy(xpath = "//*[contains(text(),'Заказать')]")
    private SelenideElement order;

    @FindBy(xpath = "//*[contains(text(),'Подтвердить')]")
    private SelenideElement confirm;

    @FindBy(xpath = "//*[contains(text(),'Закрыть')]")
    private SelenideElement closeHelp;

    @FindBy(xpath = "//p[contains(@class, 'template-list__item_header')]")
    private SelenideElement helpDoc;

    @FindBy(xpath = "//a[contains(@class, 'delete-btn')]")
    private SelenideElement deleteDoc;

    @FindBy(xpath = "//*[contains(text(),'Удалить')]")
    private SelenideElement deleteDoc1;









}
