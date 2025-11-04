package com.jsp.ebanking.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserDto {

	@NotNull(message = "Name is Required")
	private String name;
	@Email(message = "Enter Proper Email Address")
	@NotNull(message = "Email is Required")
	private String email;
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$",message = "Enter a strong password")
	private String password;
	@Pattern(regexp = "^(\\+\\d{1,3}[ -]?)?\\d{10}$", message = "Entere a proper mobile number")
	private String mobile;
	@Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$",message = "Enter Proper Dob")
	private String dob;
	@Pattern(regexp = "^(ADMIN|USER)$",message = "Enter proper role")
	private String role;
	
}
