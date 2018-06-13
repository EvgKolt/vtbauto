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
 * tags – feature's tag(may be several)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/businessportaltest", "json:target/cucumber.json"},
        features = "src/test/java/ru/open/features",
        glue = "ru/open/steps",
        tags = "@last"
)

public class BusinessPortalTest {
    @BeforeClass
    static public void setupTimeout() {

        /////////////////////////////////for remote runs////////////////////////////////
        //        Configuration.remote = "http://10.52.185.105:4419/wd/hub";
        //        Configuration.browser = "chrome";
        //        DesiredCapabilities capabilities = new DesiredCapabilities();
        //        capabilities.setBrowserName("chrome");
        //        capabilities.setCapability(ACCEPT_SSL_CERTS, true);
        //        WebDriver wd = new RemoteWebDriver(new URL("http://10.52.185.105:4419/wd/hub"), capabilities);
        //        setWebDriver(wd);

        ///////////////////////////////////for local runs////////////////////////////
        Configuration.timeout = 10000;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        Configuration.browser = "chrome";

    }
}

