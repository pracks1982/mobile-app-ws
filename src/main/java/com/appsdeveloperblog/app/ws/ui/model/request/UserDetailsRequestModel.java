package com.appsdeveloperblog.app.ws.ui.model.request;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UserDetailsRequestModel {

	@NotNull(message = "firstName cannot be empty or null")
	private String firstName;
	
	@NotNull(message = "lastName cannot be empty or null")
	private String lastName;
	
	@NotNull(message = "email cannot be empty or null")
	@Email
	private String email;
	
	@NotNull(message = "password cannot be empty or null")
	@Size(min=8,max=16,message = "Password must be greater than 8 characters and less than 16 characters")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
