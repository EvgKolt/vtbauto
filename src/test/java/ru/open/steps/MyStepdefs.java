package ru.open.steps;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.open.Constants;
import ru.open.helpers.ImageHelper;
import ru.open.helpers.Keyboard;
import ru.open.pageobjects.businessportal.ActionPage;
import ru.open.pageobjects.businessportal.LoginPage;
import ru.open.pageobjects.businessportal.MainPage;

/**
 * GIVEN steps are used to describe the initial context of the system - the scene of the scenario.
 * WHEN(AND) steps are used to describe an event, or an action.
 * THEN steps are used to describe an expected outcome, or result.
 **/

public class MyStepdefs {

    private LoginPage loginPage = page(LoginPage.class);
    private MainPage mainPage = page(MainPage.class);
    private ActionPage actionPage = page(ActionPage.class);

    @Given("^open link from property \"([^\"]*)\"$")
    public void openLinkFromProperty(String property) throws IOException, InterruptedException {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        open(properties.getProperty(property));
        sleep(4000);
    }

    @And("^type to input with name \"([^\"]*)\" property: \"([^\"]*)\" on \"([^\"]*)\"$")
    public void typeToInputWithNamePropertyOn(String nameOfElement, String property, String page) throws InterruptedException, IOException {
        sleep(5000);
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        if ("LoginPage".equals(page)) {
            loginPage.get(nameOfElement).sendKeys(properties.getProperty(property));
        } else if ("MainPage".equals(page)) {
            mainPage.get(nameOfElement).sendKeys(properties.getProperty(property));
        } else if ("ActionPage".equals(page)) {
            actionPage.get(nameOfElement).sendKeys(properties.getProperty(property));
        }
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

    @When("^load file with address \"([^\"]*)\"$")
    public void loadFileWithAddress(String fileLocation) throws InterruptedException, AWTException, IOException {
        sleep(5000);
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        Keyboard keyboard = new Keyboard();
        keyboard.type(properties.getProperty(fileLocation));
        sleep(2000);
        keyboard.pressKey('\n');
        sleep(3000);
    }

    @When("^get param from class \"([^\"]*)\" by method \"([^\"]*)\" and save as property \"([^\"]*)\"$")
    public void getParamFromClassByMethodAndSaveAsProperty(String obj, String methodName, String property) throws NoSuchMethodException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, InterruptedException {
        sleep(4000);
        Class c = Class.forName(obj);
        Object object = c.newInstance();
        Method method = object.getClass().getMethod(methodName);
        String propertyValue = (String) method.invoke(object);
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        properties.setProperty(property, propertyValue);
        try (FileWriter fileWriter = new FileWriter(Constants.PROPERTY_PATH)) {
            properties.store(fileWriter, "");
        }
    }

    @When("^wait \"([^\"]*)\"ms$")
    public void waitMs(String time) throws InterruptedException {
        sleep(Long.parseLong(time));
    }

    @When("^execute method \"([^\"]*)\" from class \"([^\"]*)\" on \"([^\"]*)\"$")
    public void executeMethodFromClassOn(String methodName, String obj, String param) throws InterruptedException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (!("".equals(param))) {
            sleep(4000);
            Class c = Class.forName(obj);
            Object object = c.newInstance();
            Method method = object.getClass().getMethod(methodName, String.class);
            method.invoke(object, param);
        }
    }

    @Then("^verify that image \"([^\"]*)\" exists$")
    public void verifyThatImageExists(String imageName) throws InterruptedException {
        sleep(5000);
        ImageHelper imageHelper = new ImageHelper();
        assertThat("no such image", imageHelper.checkImage(imageName) != null);
    }

    @Then("^verify that page with url \"([^\"]*)\" is opened$")
    public void verifyThatPageWithUrlIsOpened(String verifyUrl) throws InterruptedException {
        sleep(3000);
        String currentUrl = url();
        assertThat(currentUrl, containsString(verifyUrl));
    }

    @Then("^verify that element with text \"([^\"]*)\" \"([^\"]*)\" on \"([^\"]*)\"$")
    public void verifyThatElementWithTextOn(String nameOfElement, String condition, String page) throws Throwable {
        sleep(3000);
        if ("exists".equals(condition)) {
            if ("LoginPage".equals(page)) {
                loginPage.get(nameOfElement).waitUntil((Condition.exist), 30000);
            } else if ("MainPage".equals(page)) {
                mainPage.get(nameOfElement).waitUntil(Condition.exist, 30000);
            } else if ("ActionPage".equals(page)) {
                actionPage.get(nameOfElement).waitUntil(Condition.exist, 30000);
            }
            sleep(5000);
        } else {
            if ("LoginPage".equals(page)) {
                loginPage.get(nameOfElement).waitUntil((Condition.not(Condition.exist)), 10000);
            } else if ("MainPage".equals(page)) {
                mainPage.get(nameOfElement).waitUntil((Condition.not(Condition.exist)), 10000);
            } else if ("ActionPage".equals(page)) {
                actionPage.get(nameOfElement).waitUntil((Condition.not(Condition.exist)), 10000);
            }
        }
    }

    @Then("^verify that element with text \"([^\"]*)\" contains property \"([^\"]*)\" on \"([^\"]*)\"$")
    public void verifyThatElementWithTextContainsPropertyOn(String nameOfElement, String property, String page) throws InterruptedException {
        sleep(3000);
        if ("LoginPage".equals(page)) {
            String text = loginPage.get(nameOfElement).getText();
            assertThat(property, containsString(text));
        } else if ("MainPage".equals(page)) {
            String text = mainPage.get(nameOfElement).getText();
            assertThat(property, containsString(text));
        } else if ("ActionPage".equals(page)) {
            String text = actionPage.get(nameOfElement).getText();
            assertThat(property, containsString(text));
        }

    }

}

