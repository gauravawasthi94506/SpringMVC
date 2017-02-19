package com.Services;

import org.springframework.stereotype.Service;
@Service
public class LoginServices {
	
	    public boolean validateUser(String user, String password) {
	        return user.equalsIgnoreCase("gaurav") && password.equals("awasthi");
	    }

}
