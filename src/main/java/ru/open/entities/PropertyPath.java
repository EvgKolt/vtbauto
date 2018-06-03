package ru.open.entities;

//todo change private on public and delete getter and classname on constans
public final class PropertyPath {
    private static final String PROPERTY_PATH = "src/main/resources/properties.properties";

    public static String getPROPERTYPATH() {
        return PROPERTY_PATH;
    }
}
