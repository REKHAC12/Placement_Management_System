package com.example.Placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Placement.model.College;


@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
	 
}

