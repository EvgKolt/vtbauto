package ru.open.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import ru.open.Constants;
import ru.open.helpers.Keyboard;
import ru.open.pageobjects.AbstractPage;
import ru.open.pageobjects.businessportal.*;
import ru.open.pageobjects.shugar.ShugarActionPage;
import ru.open.pageobjects.shugar.ShugarLoginPage;
import ru.open.pageobjects.shugar.ShugarMenuPage;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

/**
 * GIVEN steps are used to describe the initial context of the system - the scene of the scenario.
 * WHEN(AND) steps are used to describe an event, or an action.
 * THEN steps are used to describe an expected outcome, or result.
 **/
@Slf4j
public class MyStepdefs {

    private Map<String, AbstractPage> pages = new HashMap<>();

    {
        pages.put("LoginPage", page(LoginPage.class));
        pages.put("MainPage", page(MainPage.class));
        pages.put("ActionPage", page(ActionPage.class));
        pages.put("CardPage", page(CardPage.class));
        pages.put("ShugarActionPage", page(ShugarActionPage.class));
        pages.put("ShugarMenuPage", page(ShugarMenuPage.class));
        pages.put("ShugarLoginPage", page(ShugarLoginPage.class));
        pages.put("KhabenskiyPage", page(KhabenskiyPage.class));
    }

    @After("@cleancookies")
    public void afterScenario() {
        getWebDriver().manage().deleteAllCookies();
    }

    @Given("^open link from property \"([^\"]*)\"$")
    public void openLinkFromProperty(String property) throws IOException, InterruptedException {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        open(properties.getProperty(property));
        sleep(30000);
    }

    @And("^type to input with name \"([^\"]*)\" property: \"([^\"]*)\" on \"([^\"]*)\"$")
    public void typeToInputWithNamePropertyOn(String nameOfElement, String property, String page) throws InterruptedException, IOException {
        sleep(2000);
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        AbstractPage abstractPage = pages.get(page);
        if (abstractPage != null) {
            abstractPage.get(nameOfElement).sendKeys(properties.getProperty(property));
        } else {
            log.error("no such page " + page);
        }
    }

    @When("^press button with text \"([^\"]*)\" on \"([^\"]*)\"$")
    public void pressButtonWithTextOn(String button, String page) throws InterruptedException {
        sleep(2000);
        AbstractPage abstractPage = pages.get(page);
        if (abstractPage != null) {
            abstractPage.get(button).click();
        } else {
            log.error("no such page " + page);
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
        sleep(5000);
        keyboard.pressKey('\n');
        sleep(5000);
    }

    @When("^get param from class \"([^\"]*)\" by method \"([^\"]*)\" and save as property \"([^\"]*)\"$")
    public void getParamFromClassByMethodAndSaveAsProperty(String obj, String methodName, String property) throws NoSuchMethodException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, InterruptedException {
        sleep(2000);
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
        sleep(2000);
        Class c = Class.forName(obj);
        Object object = c.newInstance();
        if (!param.isEmpty()) {
            Method method = object.getClass().getMethod(methodName, String.class);
            method.invoke(object, param);
        } else {
            Method method = object.getClass().getMethod(methodName);
            method.invoke(object);
        }
    }

    @Then("^verify that page with url \"([^\"]*)\" is opened$")
    public void verifyThatPageWithUrlIsOpened(String verifyUrl) throws InterruptedException {
        sleep(10000);
        String currentUrl = url();
        assertThat(currentUrl, containsString(verifyUrl));
    }

    @Then("^verify that element with text \"([^\"]*)\" \"([^\"]*)\" on \"([^\"]*)\"$")
    public void verifyThatElementWithTextOn(String nameOfElement, String condition, String page) {
        AbstractPage abstractPage = pages.get(page);
        if (abstractPage != null) {
            if ("exists".equals(condition)) {
                abstractPage.get(nameOfElement).waitUntil((Condition.exist), 15000);
            } else {
                abstractPage.get(nameOfElement).waitUntil((Condition.not(Condition.exist)), 15000);
            }
        } else {
            log.error("no such page " + page);
        }
    }

    @Then("^verify that element with text \"([^\"]*)\" contains property \"([^\"]*)\" on \"([^\"]*)\"$")
    public void verifyThatElementWithTextContainsPropertyOn(String nameOfElement, String property, String page) throws InterruptedException, IOException {
        sleep(2000);
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(Constants.PROPERTY_PATH)) {
            properties.load(fileReader);
        }
        AbstractPage abstractPage = pages.get(page);
        if (abstractPage != null) {
            String text = abstractPage.get(nameOfElement).getText().replaceAll("\\s+", "");
            assertThat(properties.getProperty(property), containsString(text));
        } else {
            log.error("no such page " + page);
        }
    }

}

