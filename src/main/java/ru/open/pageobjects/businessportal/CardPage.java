package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class CardPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(), 'Бизнес-карты')]")
    private SelenideElement businessCards;

    @FindBy(xpath = "//div[contains(@class, 'btn-container btn-container_primary-btn label-as-text')]")
    private SelenideElement orderCard;

    @FindBy(xpath = "//div[contains(@class, 'Select-placeholder')]")
    private SelenideElement cardHolder;

    @FindBy(xpath = "//div[@id='react-select-4--option-1']")
    private SelenideElement cardHolderOption1;

    @FindBy(xpath = "(//input[@id='fio_russian'])[1]")
    private SelenideElement lastName;

    @FindBy(xpath = "(//input[@id='fio_russian'])[2]")
    private SelenideElement mainName;

    @FindBy(xpath = "(//input[@id='fio_russian'])[3]")
    private SelenideElement midName;

    @FindBy(xpath = "(//div[contains(@class, 'ui-kit-datepicker')]//input)[1]")
    private SelenideElement dateOfBirth;

    @FindBy(xpath = "//input[@id='organ']")
    private SelenideElement organ;

    @FindBy(xpath = "(//input[@id='passport'])[1]")
    private SelenideElement series;

    @FindBy(xpath = "(//input[@id='passport'])[2]")
    private SelenideElement number;

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

    @FindBy(xpath = "(//span[contains(@class, 'Select-arrow-zone')])[4]")
    private SelenideElement officeBank2;

    @FindBy(xpath = "//div/span[contains(@class, 'Select-option')][1]")
    private SelenideElement officeBank3;

    @FindBy(xpath = "//input[@id='city']")
    private SelenideElement placeOfBirth;

    @FindBy(xpath = "(//*[contains(text(), 'Заказать карту')])[2]")
    private SelenideElement getCard;

    @FindBy(xpath = "//input")
    private SelenideElement smsCode;

    @FindBy(xpath = "//*[contains(text(),'Подписать')]")
    private SelenideElement sign;

    @FindBy(xpath = "(//span[contains(@class, 'Select-arrow-zone')])[2]")
    private SelenideElement account;

    @FindBy(xpath = "//div/span[contains(@class, 'select-account')][1]")
    private SelenideElement account1;

    @FindBy(xpath = "//*[contains(text(),'Белоконь')]")
    private SelenideElement card;

    @FindBy(xpath = "//*[contains(text(),'Пополнить карту')]")
    private SelenideElement replenishment;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[1]")
    private SelenideElement sum;

    @FindBy(xpath = "//*[contains(text(),'Далее')]")
    private SelenideElement nextStep;

    @FindBy(xpath = "//div[contains(@class, 'drawer__left')]/div[2]/div[3]/div")
    private SelenideElement scroller;

    @FindBy(xpath = "(//tr[contains(@class, 'oddListRowS1')]/td[11]/a)[1]")
    private SelenideElement firstResult;

    @FindBy(xpath = "//*[contains(text(), 'Ваша заявка в работе')]")
    private SelenideElement inWork;

    @FindBy(xpath = "//*[contains(text(), 'Ожидайте открытия карточного счета')]")
    private SelenideElement waitForAccount;

    @FindBy(xpath = "(//div[contains(@class, 'card-item__container')])[1]")
    private SelenideElement myAccount;

    @FindBy(xpath = "//a[contains(@class, 'toolbar-link')]")
    private SelenideElement requisites;

    @FindBy(xpath = "//*[contains(text(), 'Реквизиты компании')]")
    private SelenideElement myRequisites;

    @FindBy(xpath = "//*[contains(text(), 'Реквизиты банка')]")
    private SelenideElement bankRequisites;

    @FindBy(xpath = "//*[contains(text(), 'Счет №')]")
    private SelenideElement accountNumber;

    @FindBy(xpath = "//*[contains(text(), 'Наименование')]")
    private SelenideElement name;

    @FindBy(xpath = "//*[contains(text(), 'ИНН:')]")
    private SelenideElement inn;

    @FindBy(xpath = "//*[contains(text(), 'КПП:')]")
    private SelenideElement kpp;

    @FindBy(xpath = "//*[contains(text(), 'БИК:')]")
    private SelenideElement bik;

    @FindBy(xpath = "//*[contains(text(), 'Сохранить')]")
    private SelenideElement saveRequisites;

    @FindBy(xpath = "//*[contains(text(),'Закрыть')]")
    private SelenideElement close;

    @FindBy(xpath = "//input[@id='email']")
    private SelenideElement email;

    @FindBy(xpath = "//input[@id='phone']")
    private SelenideElement phone;

    @FindBy(xpath = "//div[contains(@class, 'input-container_files')]")
    private SelenideElement downloadImg;


}
