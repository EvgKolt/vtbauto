package ru.open.pageobjects;

import java.lang.reflect.Field;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractPage {

    public SelenideElement get(String nameOfElement) {
        Class<?> clazz = getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(nameOfElement)) {
                try {
                    field.setAccessible(true);
                    return (SelenideElement) field.get(this);
                } catch (IllegalAccessException e) {
                    log.error("no such element", e);
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
