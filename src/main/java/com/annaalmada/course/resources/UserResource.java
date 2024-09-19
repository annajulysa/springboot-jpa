package com.annaalmada.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.annaalmada.course.entities.User;

// camada de recursos (rest controllers)
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//endpoints
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(null, "Teste2", "teste2@gmail.com", "123456789", "12345");
		return ResponseEntity.ok().body(user);
	}
}
