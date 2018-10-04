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

}


