package ru.open.pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.lang.reflect.Field;

//todo add l4j delete sout
public abstract class AbstractPage {

    // private Logger logger = LogManager.getLogger(AbstractPage.class);

    public SelenideElement get(String cucumberElementName) {
        Class<?> clazz = this.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NameOfElement.class)) {
                NameOfElement nameOfElementAnnotation = field.getAnnotation(NameOfElement.class);
                if (nameOfElementAnnotation.value().equals(cucumberElementName)) {
                    try {
                        return (SelenideElement) field.get(this);
                    } catch (IllegalAccessException e) {
                        System.out.println("ERROR: element with name \" + cucumberElementName + \" at page \" + this.getClass().getName() + \" is not public");
                        //logger.error("ERROR: element with name " + cucumberElementName + " at page " + this.getClass().getName() + " is not public");
                    }
                }
            }
        }
        Selenide.screenshot("No_element");
        throw new IllegalArgumentException("ERROR: there is no such element with name " + cucumberElementName + " at page " + this.getClass().getName());
    }
}
