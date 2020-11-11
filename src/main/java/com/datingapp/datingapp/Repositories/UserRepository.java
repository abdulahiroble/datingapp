package com.datingapp.datingapp.Repositories;

import com.datingapp.datingapp.Model.CreateProfile;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CreateProfile, Long> {

}
