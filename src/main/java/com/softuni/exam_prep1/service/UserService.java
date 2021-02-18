package com.softuni.exam_prep1.service;

import com.softuni.exam_prep1.models.service.UserServiceModel;

public interface UserService {

    boolean registerUser(UserServiceModel userRegServiceModel);

    UserServiceModel findByUsername(String username);
}
