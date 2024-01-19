package com.myfirstspringapp.myFirstApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstspringapp.myFirstApp.entity.User;
import com.myfirstspringapp.myFirstApp.service.UserService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		User addUser = this.userservice.addUser(user);
		return addUser;
	}

	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable int id) {
		User getuser = this.userservice.getUserById(id);
		return getuser;
	}

	@GetMapping("/getUser")
	public List<User> getAllUser() {
		List<User> getuser = this.userservice.getAllUser();
		return getuser;
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUserById(@PathVariable int id) {
		this.userservice.deleteUser(id);
		return "User deleted succesfully of id" + id;
	}

	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id) {
		User updateduser = this.userservice.updateUser(user, id);
		return updateduser;
	}
}
