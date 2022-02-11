package com.example.Placement.repository;

import org.springframework.stereotype.Repository;

import com.example.Placement.model.StudentLogin;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentLoginRepository extends JpaRepository<StudentLogin, Long>{
	StudentLogin findByUsernameAndPassword(String username, String password);

}

