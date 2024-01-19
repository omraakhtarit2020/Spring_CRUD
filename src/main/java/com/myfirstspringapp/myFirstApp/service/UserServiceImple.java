package com.myfirstspringapp.myFirstApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfirstspringapp.myFirstApp.entity.User;
import com.myfirstspringapp.myFirstApp.exception.ResourceNotFoundException;
import com.myfirstspringapp.myFirstApp.repo.UserRepo;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserRepo userrepo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User save = this.userrepo.save(user);
		return save;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User user = this.userrepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with this id: " + id));
		return user;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> findAll = this.userrepo.findAll();
		return findAll;
	}

	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		User userById = getUserById(id);
		userById.setAge(user.getAge());
		userById.setName(user.getName());
		userById.setNumber(user.getNumber());
		userById.setId(user.getId());

		User save = this.userrepo.save(userById);
		return save;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		this.userrepo.deleteById(id);
	}

}
