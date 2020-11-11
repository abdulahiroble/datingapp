package com.datingapp.datingapp.Services;

import javax.xml.registry.infomodel.User;

import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.UserRepository;

public class UserServiceImplmentation implements UserService {
    private UserRepository userRepository;

    @Override
    public void saveUser(CreateProfile user) {
        this.userRepository.save(user);
    }
}
