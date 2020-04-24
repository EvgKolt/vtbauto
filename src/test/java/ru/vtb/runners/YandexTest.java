package ru.vtb.runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/ru/vtb/features/",
        glue = "ru.vtb.steps",
        tags = "@api, @all"
)
public class YandexTest {
    @BeforeClass
    static public void setup() {
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
    }
}


