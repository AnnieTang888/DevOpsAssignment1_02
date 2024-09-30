package com.synergisticit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)	
private Long userId;
private String username;
private String password;
private String email;

public User() {
	
}

public User(Long userId, String username, String password, String email) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
	this.email = email;
}



public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + "]";
}


}
