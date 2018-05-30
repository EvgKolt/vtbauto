package ru.open.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("^open businessportal$")
    public void openBusinessportal() throws InterruptedException {
      open("http://rumskapt273.open.ru/273/login");
      wait(5000);
    }
}
