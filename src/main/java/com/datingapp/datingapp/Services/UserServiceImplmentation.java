package com.datingapp.datingapp.Services;

import javax.xml.registry.infomodel.User;

import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplmentation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<CreateProfile> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(CreateProfile user) {
        this.userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public Page<CreateProfile> showUserList(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.userRepository.findAll(pageable);
    }

    @Override
    public CreateProfile getUserById(long id) {
        Optional<CreateProfile> optional = userRepository.findById(id);
        CreateProfile user = null;

        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException(" User not found by id " + id);
        }
        return user;
    }
}
