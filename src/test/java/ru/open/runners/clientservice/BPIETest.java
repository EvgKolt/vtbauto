//package ru.open.runners.clientservice;
//
//import com.codeborne.selenide.Configuration;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import ru.open.dao.DBConnect;
//
//import java.sql.SQLException;
//
//import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
//import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = {"html:target/cucumber-report/clientservice/chrome", "json:target/cucumberIE.json"},
//        features = "src/test/java/ru/open/features/",
//        glue = "ru/open/steps",
//        tags = "@IE"
//)
//public class BPIETest {
//    @BeforeClass
//    static public void setupTimeout() throws SQLException {
//
//        System.setProperty("file.encoding", "UTF-8");
//        System.setProperty("webdriver.ie.driver", "src/main/resources/webdrivers/IEDriverServer.exe");
//        Configuration.timeout = 10000;
//        Configuration.reportsFolder = "C:\\Jenkins513\\workspace\\MSB-Portal\\CucumberTests\\target\\cucumber-html-reports\\IE";
//        InternetExplorerDriver driver = new InternetExplorerDriver();
//        setWebDriver(driver);
//        driver.manage().window().maximize();
//        DBConnect.openConnection();
//        DBConnect.openConnectionUIDM();
//        DBConnect.openConnectionCards();
//
//    }
//
//    @AfterClass
//    static public void doAfter() {
//        getWebDriver().quit();
//        //getWebDriver().close();
//        DBConnect.closeConnections();
//    }
//}
