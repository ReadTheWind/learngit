package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demo.entity.User;

public interface UserRepository extends Repository<User, Integer>{

	public List<User> findAll();
	
	@Query("select u from User u where u.id=?1")
	public User getUser(Integer id);
}
