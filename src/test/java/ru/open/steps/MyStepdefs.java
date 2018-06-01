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
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.Key;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MyStepdefs {

    private LoginPage loginPage = page(LoginPage.class);
    private MainPage mainPage = page(MainPage.class);
    private ActionPage actionPage = page(ActionPage.class);
    private String propertiesPath = "src/main/resources/properties.properties";

    @Given("^open businessportal$")
    public void openBusinessportal() throws InterruptedException {
        open("http://rumskapt273.open.ru/273/login");
        //прогрузка элементов
        sleep(3000);
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

    @When("^load file with address \"([^\"]*)\"$")
    public void loadFileWithAddress(String fileLocation) throws InterruptedException, AWTException, IOException {
        sleep(5000);
        try (FileReader fileReader = new FileReader(propertiesPath)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            Keyboard keyboard = new Keyboard();
            keyboard.type(properties.getProperty(fileLocation));
            sleep(2000);
            keyboard.pressKey('\n');
            sleep(3000);
        }
    }

    @And("^type to input with name \"([^\"]*)\" property: \"([^\"]*)\" on \"([^\"]*)\"$")
    public void typeToInputWithNamePropertyOn(String nameOfElement, String property, String page) throws InterruptedException, IOException {
        sleep(3000);
        try (FileReader fileReader = new FileReader(propertiesPath)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            if ("LoginPage".equals(page)) {
                loginPage.get(nameOfElement).sendKeys(properties.getProperty(property));
            } else if ("MainPage".equals(page)) {
                mainPage.get(nameOfElement).sendKeys(properties.getProperty(property));
            } else if ("ActionPage".equals(page)) {
                actionPage.get(nameOfElement).sendKeys(properties.getProperty(property));
            }
        }
    }

    @Then("^verify that element with text \"([^\"]*)\" exists on \"([^\"]*)\"$")
    public void verifyThatElementWithTextExistsOn(String nameOfElement, String page){
        if ("LoginPage".equals(page)) {
            loginPage.get(nameOfElement).waitUntil(Condition.exist, 10000);
        } else if ("MainPage".equals(page)) {
            mainPage.get(nameOfElement).waitUntil(Condition.exist, 10000);
        } else if ("ActionPage".equals(page)) {
            actionPage.get(nameOfElement).waitUntil(Condition.exist, 10000);
        }
    }
}

