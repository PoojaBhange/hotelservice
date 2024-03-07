package com.lcwd.hotel.exception;

import org.springframework.http.ResponseEntity;

import com.lcwd.hotel.payload.ApiResponse;

public class ResourceNotFoundException extends RuntimeException{

	
	public ResourceNotFoundException() {
		super("resource not found");
		
	}

	public ResourceNotFoundException(String s) {
		super(s);
	}

	
	
}
