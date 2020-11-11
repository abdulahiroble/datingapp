package com.datingapp.datingapp.Services;

import javax.xml.registry.infomodel.User;

import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplmentation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(CreateProfile user) {
        this.userRepository.save(user);
    }
}
