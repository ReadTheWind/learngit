package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserDao;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private  UserDao userDao;
	@Autowired
	private  UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		
		return userDao.findAll();
	}

	@Override
	public List<User> getUsers2() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUsersById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.getUser(id);
	}

}
