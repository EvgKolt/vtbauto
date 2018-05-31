package ru.open.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import ru.open.pageobjects.ActionPage;
import ru.open.pageobjects.LoginPage;
import ru.open.pageobjects.MainPage;
import ru.open.parsersandhelpers.Keyboard;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.security.Key;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MyStepdefs {

    private LoginPage loginPage = page(LoginPage.class);
    private MainPage mainPage = page(MainPage.class);
    private ActionPage actionPage = page(ActionPage.class);

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
        } else if ("ActionPage".equals(page)) {
            actionPage.get(nameOfElement).sendKeys(text);
        }
    }

    @When("^press button with text \"([^\"]*)\" on \"([^\"]*)\"$")
    public void pressButtonWithTextOn(String button, String page) throws InterruptedException {
        sleep(5000);
        if ("LoginPage".equals(page)) {
            loginPage.get(button).click();
        } else if ("MainPage".equals(page)) {
            mainPage.get(button).click();
        } else if ("ActionPage".equals(page)) {
            actionPage.get(button).click();
        }
    }

    @Then("^verify that page with url \"([^\"]*)\" is opened$")
    public void verifyThatPageWithUrlIsOpened(String verifyUrl) throws InterruptedException {
        sleep(3000);
        String currentUrl = url();
        assertThat(currentUrl, containsString(verifyUrl));
    }

    @Then("^verify that element with text \"([^\"]*)\" exists$")
    public void verifyThatElementWithTextExists(String verifyText) throws Throwable {
        loginPage.get("Неправильный логин").waitUntil(Condition.exist, 10000);
    }

    @When("^load file with address \"([^\"]*)\"$")
    public void loadFileWithAddress(String fileLocation) throws InterruptedException, AWTException {
        sleep(5000);
        Keyboard keyboard = new Keyboard();
        keyboard.type(fileLocation);
        sleep(2000);
        keyboard.pressKey('\n');
        sleep(3000);
    }
}

