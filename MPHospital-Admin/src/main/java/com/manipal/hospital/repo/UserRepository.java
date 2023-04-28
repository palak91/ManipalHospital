package com.manipal.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.hospital.pojo.UserProfile;

public interface UserRepository extends JpaRepository<UserProfile, Integer>{

}
