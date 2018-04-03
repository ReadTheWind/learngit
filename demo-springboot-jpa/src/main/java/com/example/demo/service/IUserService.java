package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface IUserService {
	
	public List<User> getUsers();
	
	public List<User> getUsers2();
	
	public User getUsersById(Integer id);
}
