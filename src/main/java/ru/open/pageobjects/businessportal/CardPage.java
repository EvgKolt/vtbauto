package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class CardPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(), 'Бизнес-карты')]")
    private SelenideElement businessCards;

    @FindBy(xpath = "//*[contains(text(), 'Заказать карту')]")
    private SelenideElement orderCard;

    @FindBy(xpath = "//div[contains(@class, 'input-ui__focus')]/input")
    private SelenideElement tipicalInput;

    @FindBy(xpath = "//*[contains(text(), 'Фамилия')]")
    private SelenideElement lastName;

    @FindBy(xpath = "//*[contains(text(), 'Имя')]")
    private SelenideElement mainName;

    @FindBy(xpath = "//*[contains(text(), 'Отчество')]")
    private SelenideElement midName;

    @FindBy(xpath = "//*[contains(text(), 'Дата рождения')]")
    private SelenideElement dateOfBirth;

    @FindBy(xpath = "//*[contains(text(), 'Наименование органа, выдавшего документ')]")
    private SelenideElement organ;

    @FindBy(xpath = "//*[contains(text(), 'Серия')]")
    private SelenideElement series;

    @FindBy(xpath = "//*[contains(text(), 'Номер')]")
    private SelenideElement number;

    @FindBy(xpath = "//*[contains(text(), 'Дата выдачи')]")
    private SelenideElement dateOfReg;

    @FindBy(xpath = "//*[contains(text(), 'Код подразделения')]")
    private SelenideElement officeCode;

    @FindBy(xpath = "(//div[contains(@class, 'input-ui')]/input)[11]")
    private SelenideElement region;

    @FindBy(xpath = "//*[contains(text(), 'Место рождения')]")
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

    @FindBy(xpath = "//*[contains(text(), 'Место рождения')]")
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

    @FindBy(xpath = "//span[contains(@class, 'tab__status tab__status_confirm')]")
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

    @FindBy(xpath = "(//*[contains(text(), 'Карт')])")
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

    @FindBy(xpath = "//*[contains(text(),'E-mail')]")
    private SelenideElement email;

    @FindBy(xpath = "//*[contains(text(),'Телефон')]")
    private SelenideElement phone;

    @FindBy(xpath = "//div[contains(@class, 'input-container_files')]")
    private SelenideElement downloadImg;

    @FindBy(xpath = "//*[contains(text(),'По вашей заявке необходима дополнительная информация')]")
    private SelenideElement needInfo;

    @FindBy(xpath = "//*[contains(text(),'Открыть корпоративную карту невозможно')]")
    private SelenideElement cantOpenCard;

    @FindBy(xpath = "//span[contains(@class, 'card-custom__name')]")
    private SelenideElement vizElemA;

    @FindBy(xpath = "//div[contains(@class, 'btn-container btn-container_primary-btn label-as-text')]")
    private SelenideElement vizElemB;

    @FindBy(xpath = "//a[contains(@class, 'card-info__link')]")
    private SelenideElement vizElemC;

    @FindBy(xpath = "//h2")
    private SelenideElement vizElemD;

    @FindBy(xpath = "//p")
    private SelenideElement vizElemE;

    @FindBy(xpath = "//h3")
    private SelenideElement vizElemF;

    @FindBy(xpath = "//*[contains(text(),'Последние операции')]")
    private SelenideElement vizElemG;

    @FindBy(xpath = "//div[contains(@class, 'timeline__date timeline__date_first row middle-xs between-xs')]/div[contains(@class, 'col-xs-3')]")
    private SelenideElement vizElemI;

    @FindBy(xpath = "//div[contains(@class, 'account-name')]/a")
    private SelenideElement vizElemJ;

    @FindBy(xpath = "//span[contains(@class, 'toolbar__balance')]/span[contains(@class, 'finance')]/span[1]")
    private SelenideElement vizElemK;

    @FindBy(xpath = "//a[contains(@class, 'toolbar-link')]")
    private SelenideElement vizElemL;

    @FindBy(xpath = "//*[contains(text(),'Пополнение')]")
    private SelenideElement vizElemM;

    @FindBy(xpath = "//*[contains(text(),'Расходы')]")
    private SelenideElement vizElemN;

    @FindBy(xpath = "//div[contains(@class, 'toolbar__card')]")
    private SelenideElement vizElemO;

    @FindBy(xpath = "//div[contains(@class, 'account-name')]/a")
    private SelenideElement accountName;

    @FindBy(xpath = "//input")
    private SelenideElement accountNameInput;

}
