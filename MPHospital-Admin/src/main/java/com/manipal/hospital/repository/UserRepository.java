package com.manipal.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.hospital.pojo.UserProfile;

@Repository
public interface UserRepository extends JpaRepository<UserProfile, Integer>{

}
