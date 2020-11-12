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
    public Page<CreateProfile> findPaginated(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.userRepository.findAll(pageable);
    }
}
