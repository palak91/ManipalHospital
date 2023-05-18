package com.manipal.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.hospital.pojo.UserProfile;
import com.manipal.hospital.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/userinfo/{id}")
	public UserProfile getUserInfo(@PathVariable Integer id) {
	
		return userService.getUsers(id);
	}
	

}
