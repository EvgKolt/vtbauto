package ru.open.pageobjects.shugar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class ShugarActionPage extends AbstractPage {

    @FindBy(id = "inn_advanced")
    private SelenideElement inn;

    @FindBy(xpath = "//option[contains(text(),'Корп.карты / самоинкассация – Бизнес Портал')]")
    private SelenideElement requestType;

    @FindBy(id = "search_form_submit")
    private SelenideElement search;

    @FindBy(id = "tab_link_MoneyAccount|advanced_search")
    private SelenideElement searchAdvanced;

    @FindBy(xpath = "//*[contains(text(), '\n"
            + "В работе ООС (РСЦ)')]")
    private SelenideElement inWork;

    @FindBy(xpath = "//a[@title='Изменить']")
    private SelenideElement changeStatus;

    @FindBy(xpath = "//select[@id='status']")
    private SelenideElement statusMenu;

    @FindBy(xpath = "//select/option[@value='waiting_info']")
    private SelenideElement statusMenuOption1;

    @FindBy(xpath = "//form[@id='set_status_frm']/input[contains(@class, 'button')]")
    private SelenideElement saveStatus;

}

