package ru.open.pageobjects.shugar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class ShugarMenuPage extends AbstractPage {

    @FindBy(id = "grouptab_7")
    private SelenideElement different;

    @FindBy(id = "moduleTab_7_MoneyAccount")
    private SelenideElement accounts;

}
