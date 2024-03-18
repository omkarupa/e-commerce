package com.ou_solutions.productservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGlobalException(Exception e)
	{
		return ResponseEntity.badRequest().body("An Unexpected error occured with Message : " + e.getMessage());
		
	}

}
