package ru.open.pageobjects;

import java.lang.reflect.Field;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractPage {

    public SelenideElement get(String cucumberElementName) {
        Class<?> clazz = this.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NameOfElement.class)) {
                NameOfElement nameOfElementAnnotation = field.getAnnotation(NameOfElement.class);
                if (nameOfElementAnnotation.value().equals(cucumberElementName)) {
                    try {
                        return (SelenideElement) field.get(this);
                    } catch (IllegalAccessException e) {
                        log.error("ERROR: element is not public", e);
                    }
                }
            }
        }
        Selenide.screenshot("No_element");
        throw new IllegalArgumentException("ERROR: there is no such element with name " + cucumberElementName + " at page " + this.getClass().getName());
    }
}
