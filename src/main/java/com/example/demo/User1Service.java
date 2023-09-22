package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class User1Service {
	@Autowired
	User1Repository repository;

	void saveUser(Users1 user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
	}

	public Iterable<Users1> getAllUsers() {
		return repository.findAll();
	}

	public void deleteUser(int id) {
		repository.deleteById(id);

	}
}