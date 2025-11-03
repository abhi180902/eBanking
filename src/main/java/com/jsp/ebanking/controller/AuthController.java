package com.jsp.ebanking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ebanking.dto.UserDto;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	@PostMapping("/register")
	public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userdto) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userdto);
	}

}
