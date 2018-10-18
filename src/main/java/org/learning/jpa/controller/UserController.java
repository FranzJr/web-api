package org.learning.jpa.controller;

import org.learning.jpa.model.UserEntity;
import org.learning.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	private final static String USER_ROOT = "users";
	
	@Autowired
	private UserService repository;

	@DeleteMapping(USER_ROOT + "/deleteAll")
	private void deleteAll() {
		repository.deleteAll();

	}
	
	@PostMapping(USER_ROOT + "/create")
	@ResponseBody
	private UserEntity createUser(@RequestParam String name, @RequestParam String lastName) {
			
		UserEntity user = repository.save(new UserEntity(name, lastName));
		return user;
	}

}
