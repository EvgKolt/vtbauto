package ru.open.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(xpath = "//*[contains(text(),'Тестовый запрос')]")
    public SelenideElement testrequest;

}
