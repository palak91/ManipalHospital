package com.manipal.hospital.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.hospital.Exception.UserNotFound;
import com.manipal.hospital.pojo.UserProfile;
import com.manipal.hospital.repo.UserRepository;
import com.manipal.hospital.service.IUserService;


@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserProfile getUsers(Integer id) {
		
		Optional<UserProfile> user = repo.findById(id);
		if(user.isPresent()) {
			
			return  user.get();
		}
		return null;
				
	}
	


}
