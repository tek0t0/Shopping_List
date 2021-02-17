package com.softuni.exam_prep1.models.service;

public class UserRegServiceModel {
    private String username;
    private String email;
    private String password;

    public UserRegServiceModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserRegServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
