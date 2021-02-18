package com.softuni.exam_prep1.models.binding;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserLoginBindingModel {

    private String username;
    private String password;

    public UserLoginBindingModel() {
    }

    @NotBlank(message = "Enter username")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 symbols!")
    public String getUsername() {
        return username;
    }

    public UserLoginBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    @NotBlank(message = "Enter password!")
    @Size(min = 3, max = 20, message = "Password must be between 3 and 20 symbols!")
    public String getPassword() {
        return password;
    }

    public UserLoginBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
