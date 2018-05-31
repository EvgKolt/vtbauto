package ru.open.entities;

// TODO: 30.05.2018 продумать как сделать динамическим пароль пользователя, что б он автообновлялся после смены

public interface User {

    String login = "";
    String password = "";

    public String getLogin();

    public void setLogin(String login);

    public String getPassword();

    public void setPassword(String password);

    public String toString();
}
