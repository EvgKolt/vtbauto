package ru.open.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ru.open.pageobjects.LoginPage;
import ru.open.pageobjects.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MyStepdefs {

    private LoginPage loginPage = page(LoginPage.class);
    private MainPage mainPage = page(MainPage.class);

    @Given("^open businessportal$")
    public void openBusinessportal() throws InterruptedException {
        open("http://rumskapt273.open.ru/273/login");
        //прогрузка элементов
        sleep(3000);
    }

    @And("^type to input with name \"([^\"]*)\" text: \"([^\"]*)\" on \"([^\"]*)\"$")
    public void typeToInputWithNameTextOn(String nameOfElement, String text, String page) throws InterruptedException {
        sleep(3000);
        if ("LoginPage".equals(page)) {
            loginPage.get(nameOfElement).sendKeys(text);
        } else if ("MainPage".equals(page)) {
            mainPage.get(nameOfElement).sendKeys(text);
        }
    }

    @When("^press button with text \"([^\"]*)\" on \"([^\"]*)\"$")
    public void pressButtonWithTextOn(String button, String page) throws InterruptedException {
        sleep(5000);
        if ("LoginPage".equals(page)) {
            loginPage.get(button).click();
        } else if ("MainPage".equals(page)) {
            mainPage.get(button).click();
        }
    }

    @Then("^verify that page with url \"([^\"]*)\" is opened$")
    public void verifyThatPageWithUrlIsOpened(String verifyUrl) throws InterruptedException {
        sleep(3000);
        String currentUrl = url();
        assertThat(currentUrl, containsString(verifyUrl));
       }
}
