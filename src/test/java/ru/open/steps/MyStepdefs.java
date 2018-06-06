package ru.open.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.open.entities.Constants;
import ru.open.pageobjects.ActionPage;
import ru.open.pageobjects.LoginPage;
import ru.open.pageobjects.MainPage;
import ru.open.parsersandhelpers.Keyboard;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MyStepdefs {

    private LoginPage loginPage = page(LoginPage.class);
    private MainPage mainPage = page(MainPage.class);
    private ActionPage actionPage = page(ActionPage.class);

    @Given("^open link from property \"([^\"]*)\"$")
    public void openLinkFromProperty(String property) throws IOException, InterruptedException {
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            open(properties.getProperty(property));
        }
        sleep(4000);
    }

    @When("^press button with text \"([^\"]*)\" on \"([^\"]*)\"$")
    public void pressButtonWithTextOn(String button, String page) throws InterruptedException {
        sleep(3000);
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
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
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
        sleep(5000);
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
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
    public void verifyThatElementWithTextExistsOn(String nameOfElement, String page) throws InterruptedException {
        sleep(3000);
        if ("LoginPage".equals(page)) {
            loginPage.get(nameOfElement).waitUntil(Condition.exist, 10000);
        } else if ("MainPage".equals(page)) {
            mainPage.get(nameOfElement).waitUntil(Condition.exist, 10000);
        } else if ("ActionPage".equals(page)) {
            actionPage.get(nameOfElement).waitUntil(Condition.exist, 10000);
        }
        sleep(5000);
    }

    @When("^get param from class \"([^\"]*)\" by method \"([^\"]*)\" and save as property \"([^\"]*)\"$")
    public void getParamFromClassByMethodAndSaveAsProperty(String obj, String methodName, String property) throws NoSuchMethodException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, InterruptedException {
        sleep(4000);
        Class c = Class.forName(obj);
        Object object = c.newInstance();
        Method method = object.getClass().getMethod(methodName);
        String propertyValue = (String) method.invoke(object);
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            fileReader.close();
            properties.setProperty(property, propertyValue);
            try (FileWriter fileWriter = new FileWriter(Constants.PROPERTY_PATH)) {
                properties.store(fileWriter, "");
                fileReader.close();
            }
        }
    }

    @When("^wait \"([^\"]*)\"ms$")
    public void waitMs(String time) throws InterruptedException {
        sleep(Long.parseLong(time));
    }
}

