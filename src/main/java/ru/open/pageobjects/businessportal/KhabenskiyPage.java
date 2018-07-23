package ru.open.pageobjects.businessportal;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class KhabenskiyPage extends AbstractPage {
    @FindBy(xpath = "//div[contains(@class, 'partner-banner__title')]")
    private SelenideElement fond;

    @FindBy(xpath = "(//div[contains(@class, 'btn-container primary-btn__active label-as-number')])[1]")
    private SelenideElement thousand;

    @FindBy(xpath = "//*[contains(text(), 'Далее')]")
    private SelenideElement next;

    @FindBy(xpath = "//label/label")
    private SelenideElement charityAgreement;
}
