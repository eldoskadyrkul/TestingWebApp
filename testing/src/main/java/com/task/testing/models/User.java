package com.task.testing.models;


public class User {

    private int id;
    private String name;
    private String lastname;
    private String login;
    private String password;
    private int roleID;

    public User(int id, String name, String lastname, String login, String password, int roleID) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.roleID = roleID;
    }
    public User(int id, String name, String lastname, String login, int roleID) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.roleID = roleID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

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

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
}
