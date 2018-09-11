package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class KhabenskiyPage extends AbstractPage {
    @FindBy(xpath = "//div[contains(@class, 'col-xs-3 partner-banner__logo')]")
    private SelenideElement fond;

    @FindBy(xpath = "(//div[contains(@class, 'btn-container btn-container_primary-btn label-as-number')])[1]")
    private SelenideElement thousand;

    @FindBy(xpath = "//*[contains(text(), 'Далее')]")
    private SelenideElement next;

    @FindBy(xpath = "//label/label")
    private SelenideElement charityAgreement;

    @FindBy(xpath = "//*[contains(text(),'Закрыть')]")
    private SelenideElement close;
}
