package com.annaalmada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annaalmada.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
