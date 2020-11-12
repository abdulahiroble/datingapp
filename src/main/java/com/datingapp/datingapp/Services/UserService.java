package com.datingapp.datingapp.Services;

import com.datingapp.datingapp.Model.CreateProfile;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<CreateProfile> getAllUsers();

    void saveUser(CreateProfile user);

    Page<CreateProfile> findPaginated(int pageNo, int pageSize);
}
