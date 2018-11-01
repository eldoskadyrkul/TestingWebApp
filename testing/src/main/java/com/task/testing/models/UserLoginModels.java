package com.task.testing.models;

public class UserLoginModels {
    private String login;
    private String password;

    public UserLoginModels(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserLoginModels() {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
