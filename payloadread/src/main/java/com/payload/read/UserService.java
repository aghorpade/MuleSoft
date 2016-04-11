package com.payload.read;

import org.mule.api.annotations.param.Payload;

public class UserService {

	
	public UserDTO ReadUserData(@Payload User user){
		
		UserDTO userObject = new UserDTO(1, user.getFirstname(), user.getLastname());
		
		return userObject;
	}
	
	
}
