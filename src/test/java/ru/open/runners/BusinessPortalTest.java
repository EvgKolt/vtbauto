package ru.open.runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * plugin – reporting
 * ru.open.features – features
 * glue – steps
 * tags – feature's tag
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/businessportaltest", "json:target/cucumber.json"},
        features = "src/test/java/ru/open/features",
        glue = "ru/open/steps/",
        tags = "@businessportaltest"
)

public class BusinessPortalTest {
    @BeforeClass
    static public void setupTimeout() {
        Configuration.timeout = 10000;
        /**
         * Webdriver configuration - optional
         * */
        /*
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Configuration.browser = "chrome";
        */
    }
}

