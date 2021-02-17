package com.softuni.exam_prep1.service.impl;

import com.softuni.exam_prep1.models.entities.UserEntity;
import com.softuni.exam_prep1.models.service.UserRegServiceModel;
import com.softuni.exam_prep1.repository.UserRepo;
import com.softuni.exam_prep1.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserRegServiceModel userRegServiceModel) {
        userRepo.save(modelMapper.map(userRegServiceModel, UserEntity.class));
    }
}
