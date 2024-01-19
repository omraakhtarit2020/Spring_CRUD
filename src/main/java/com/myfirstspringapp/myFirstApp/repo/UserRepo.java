package com.myfirstspringapp.myFirstApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myfirstspringapp.myFirstApp.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
