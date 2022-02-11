package com.example.Placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Placement.model.StudentLogin;
import com.example.Placement.repository.StudentLoginRepository;



@Service
public class StudentLoginService {
	
	@Autowired
	private StudentLoginRepository repo;
  
  public StudentLogin StudentLogin(String username, String password) {
	  StudentLogin user1= repo.findByUsernameAndPassword(username, password);
  	return user1;
  }
	

}