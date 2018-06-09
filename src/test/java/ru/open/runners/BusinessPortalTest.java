package ru.open.runners;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static org.openqa.selenium.remote.CapabilityType.ACCEPT_SSL_CERTS;

import java.net.MalformedURLException;
import java.net.URL;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
    static public void setupTimeout() throws MalformedURLException {

        Dimension d = new Dimension(1382, 744);
        //Resize the current window to the given dimension
        /////////////////////////////////for remote runs////////////////////////////////
        Configuration.remote = "http://10.52.185.105:4419/wd/hub";
        Configuration.browser = "chrome";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability(ACCEPT_SSL_CERTS, true);
        WebDriver wd = new RemoteWebDriver(new URL("http://10.52.185.105:4419/wd/hub"), capabilities);
        setWebDriver(wd);
        wd.manage().window().setSize(d);

        /*
        ///////////////////////////////////for local runs////////////////////////////
        Configuration.timeout = 10000;
        //Webdriver configuration - optional
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        Configuration.browser = "chrome";*/

    }
}

