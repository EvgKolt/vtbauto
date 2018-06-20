package ru.open.runners.clientservice;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


/**
 * plugin – reporting
 * ru.open.features – features
 * glue – steps
 * tags – feature's tag(may be several)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/clientservice", "json:target/cucumber.json"},
        features = "src/test/java/ru/open/features/clientservice",
        glue = "ru/open/steps",
        tags = "@csmoztest"
)

public class CSMozTest {
    @BeforeClass
    static public void setupTimeout() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/webdrivers/geckodriver.exe");
        Configuration.timeout = 10000;
        //        WebDriver driver = new FirefoxDriver();
        //        setWebDriver(driver);
        //        driver.manage().window().maximize();
    }
}

