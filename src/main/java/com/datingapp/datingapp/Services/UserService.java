package com.datingapp.datingapp.Services;

import com.datingapp.datingapp.Model.CreateProfile;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<CreateProfile> getAllUsers();

    void saveUser(CreateProfile user);

    void deleteUser(long id);

    CreateProfile getUserById(long id);

    Page<CreateProfile> showUserList(int pageNo, int pageSize);
}
