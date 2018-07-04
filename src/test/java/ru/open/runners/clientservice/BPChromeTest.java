package ru.open.runners.clientservice;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

import java.sql.SQLException;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.open.dao.DBConnect;


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
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        Configuration.timeout = 10000;
        ChromeDriver driver = new ChromeDriver();
        setWebDriver(driver);
        driver.manage().window().maximize();

        DBConnect.openConnection();
        DBConnect.openConnectionUIDM();
        DBConnect.openConnectionCards();

    }

    @AfterClass
    static public void doAfter() {
        getWebDriver().close();
        DBConnect.closeConnections();
    }
}


