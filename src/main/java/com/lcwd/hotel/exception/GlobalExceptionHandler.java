package com.lcwd.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.hotel.payload.ApiResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler
public ResponseEntity<ApiResponse> handlerResourceNotFoundException(Exception ex){
		String message = ex.getMessage();
		
		return new ResponseEntity<>(ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build(),HttpStatus.NOT_FOUND);
	}
	
}
