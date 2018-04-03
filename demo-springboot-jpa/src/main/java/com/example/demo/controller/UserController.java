package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@RestController
public class UserController {

	@Autowired
	IUserService userservice;
	
	@RequestMapping(value="getuser",method=RequestMethod.GET)
	public List<User> getUser(){
		return userservice.getUsers();
	}
	
	@RequestMapping(value="getuser2",method=RequestMethod.GET)
	public List<User> getUser2(){
		return userservice.getUsers2();
	}
	
	@RequestMapping(value="getById/{id}",method=RequestMethod.GET)
	public User getById(@PathVariable Integer id){
		return userservice.getUsersById(id);
	}
}
