package com.arjun.springboot.myfirstwebapp.hello.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username,String password) {
		boolean isValidUserName = username.equalsIgnoreCase("arjun");
		boolean isValidPassword = password.equalsIgnoreCase("sailu");
		return isValidUserName && isValidPassword;
	}

}
