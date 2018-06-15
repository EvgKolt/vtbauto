package ru.open.runners;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * plugin – reporting
 * ru.open.features – features
 * glue – steps
 * tags – feature's tag(may be several)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/businessportaltest", "json:target/cucumber.json"},
        features = "src/test/java/ru/open/features",
        glue = "ru/open/steps",
        tags = "@businessportaltest"
)

public class BusinessPortalTest {
    @BeforeClass
    static public void setupTimeout() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        Configuration.timeout = 10000;
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        driver.manage().window().maximize();
    }
}

