package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;
import ru.open.pageobjects.NameOfElement;

public class ActionPage extends AbstractPage {

    @NameOfElement("Написать письмо")
    @FindBy(xpath = "//button[contains(., 'Написать сообщение')]")
    public SelenideElement writeletter;

    @NameOfElement("Категория вопроса")
    @FindBy(className = "Select-placeholder")
    public SelenideElement questioncategory;

    @NameOfElement("Открытие счета")
    @FindBy(xpath = "//*[contains(text(),'Открытие счета')]")
    public SelenideElement openaccount;

    @NameOfElement("Тема")
    @FindBy(xpath = "//input[@type='text']")
    public SelenideElement theme;

    @NameOfElement("Сообщение")
    @FindBy(xpath = "//textarea[contains(@rows, '6')]")
    public SelenideElement message;

    @NameOfElement("Приложить файл")
    @FindBy(className = "input-container_files")
    public SelenideElement addfile;

    @NameOfElement("Отправить")
    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    public SelenideElement sendmessage;

    @NameOfElement("Тестовый запрос")
    @FindBy(xpath = "//*[contains(text(),'TESTOVII ZAPROS')]")
    public SelenideElement testrequest;

    @NameOfElement("Изменить телефон")
    @FindBy(xpath = "(//*[contains(text(),'Изменить')])[2]")
    public SelenideElement changephone;

    @NameOfElement("Новый телефон")
    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/form/div[3]/div/div/div/input")
    public SelenideElement inputnumber;

    @NameOfElement("Сохранить телефон")
    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/form/div[4]/div/button[1]/div")
    public SelenideElement savephone;

    @NameOfElement("СМС Код")
    @FindBy(className = "input-style")
    public SelenideElement smscode;

    @NameOfElement("Подписать")
    @FindBy(xpath = "//button[@class='btn-wrapper' and @type='submit']")
    public SelenideElement sign;

    @NameOfElement("Номер телефона")
    @FindBy(xpath = "//*[@id=\"widget0\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div/input")
    public SelenideElement phone;

    @NameOfElement("Фонд Хабенского")
    @FindBy(xpath = "//div[@class='row']")
    public SelenideElement fond;

    @NameOfElement("Тысяча")
    @FindBy(xpath = "//div[@class='btn-container primary-btn__active label-as-number']")
    public SelenideElement thousand;

    @NameOfElement("Я согласен")
    @FindBy(xpath = "//*[contains(text(),'Я ознакомлен с условиями ')]")
    public SelenideElement agreement;


}
