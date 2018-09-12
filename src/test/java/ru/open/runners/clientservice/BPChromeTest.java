package ru.open.runners.clientservice;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.open.dao.DBConnect;

import java.sql.SQLException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;


/**
 * plugin – reporting
 * ru.open.features – features
 * glue – steps
 * tags – feature's tag(may be several)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/clientservice/chrome", "json:target/cucumber.json"},
        features = "src/test/java/ru/open/features/",
        glue = "ru/open/steps",
        tags = "@BPtest"
)

public class BPChromeTest {
    @BeforeClass
    static public void setupTimeout() throws SQLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        Configuration.timeout = 10000;
        Configuration.reportsFolder = "C:\\Jenkins513\\workspace\\MSB-Portal\\CucumberTests\\target\\cucumber-html-reports";
        ChromeDriver driver = new ChromeDriver(capabilities);
        setWebDriver(driver);
        driver.manage().window().maximize();
        DBConnect.openConnection();
        DBConnect.openConnectionUIDM();
        DBConnect.openConnectionCards();

    }

    @AfterClass
    static public void doAfter() {
        getWebDriver().quit();
        //getWebDriver().close();
        DBConnect.closeConnections();
    }
}


