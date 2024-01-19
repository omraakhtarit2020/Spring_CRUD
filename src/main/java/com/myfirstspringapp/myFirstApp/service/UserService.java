package com.myfirstspringapp.myFirstApp.service;

import java.util.List;

import com.myfirstspringapp.myFirstApp.entity.User;

public interface UserService {

	public User addUser(User user);

	public User getUserById(int id);

	public List<User> getAllUser();

	public User updateUser(User user, int id);

	public void deleteUser(int id);

}
