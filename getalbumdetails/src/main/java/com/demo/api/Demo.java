package com.demo.api;

import javax.ws.rs.InternalServerErrorException;


public class Demo {

	public String throwException(){
		throw new InternalServerErrorException("Internal server error occured");
	}
	
}
