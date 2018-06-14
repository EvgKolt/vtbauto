package ru.open.runners;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

        /////////////////////////////////for remote runs////////////////////////////////
        //        Configuration.remote = "http://10.52.185.105:4419/wd/hub";
        //        Configuration.browser = "chrome";
        //        DesiredCapabilities capabilities = new DesiredCapabilities();
        //        capabilities.setBrowserName("chrome");
        //        capabilities.setCapability(ACCEPT_SSL_CERTS, true);
        //        WebDriver wd = new RemoteWebDriver(new URL("http://10.52.185.105:4419/wd/hub"), capabilities);
        //        setWebDriver(wd);
        ///////////////////////////////////for local runs////////////////////////////
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        Configuration.timeout = 10000;
        ChromeOptions chop = new ChromeOptions();
        chop.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(chop);
        setWebDriver(driver);
        driver.manage().window().maximize();
    }
}

