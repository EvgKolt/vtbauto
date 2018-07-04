package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class CardPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(@class, 'menu__item_add')]")
    private SelenideElement businessCards;

    @FindBy(xpath = "//div[contains(@class, 'btn-container primary-btn__active label-as-text')]")
    private SelenideElement orderCard;

    @FindBy(xpath = "//div[contains(@class, 'Select-placeholder')]")
    private SelenideElement cardHolder;

    @FindBy(xpath = "//div[@id='react-select-4--option-0']")
    private SelenideElement cardHolderOption1;

    @FindBy(xpath = "//input[@id='organ']")
    private SelenideElement organ;

    @FindBy(xpath = "(//div[contains(@class, 'ui-kit-datepicker')])[2]")
    private SelenideElement dateOfReg;

    @FindBy(xpath = "//input[@id='code']")
    private SelenideElement officeCode;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[11]")
    private SelenideElement region;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[13]")
    private SelenideElement city;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[14]")
    private SelenideElement street;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[15]")
    private SelenideElement house;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[17]")
    private SelenideElement flat;

    @FindBy(xpath = "//input[@id='organization']")
    private SelenideElement organisation;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[22]")
    private SelenideElement secretWord;

    @FindBy(xpath = "//input[@id='organization']")
    private SelenideElement office;

    @FindBy(xpath = "//input[contains(@class, 'Select-input')]")
    private SelenideElement officeBank;

    @FindBy(xpath = "//div[@id='react-select-6--option-0']")
    private SelenideElement officeBank1;

    @FindBy(xpath = "//input[@id='city']")
    private SelenideElement placeOfBirth;

    @FindBy(xpath = "(//div[contains(@class, 'btn-container primary-btn__active label-as-text')])[2]")
    private SelenideElement getCard;

    @FindBy(xpath = "//input")
    private SelenideElement smsCode;

    @FindBy(xpath = "//*[contains(text(),'Подписать')]")
    private SelenideElement sign;

    @FindBy(xpath = "(//span[contains(@class, 'Select-arrow-zone')])[2]")
    private SelenideElement account;

    @FindBy(xpath = "//div/span[contains(@class, 'select-account')][1]")
    private SelenideElement account1;


}